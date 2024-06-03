package org.example.oc.feign

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.cloud.openfeign.FallbackFactory
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "httpBinKt",
//    url = "https://httpbin.org",
    url = "http://127.0.0.1:8011",
    fallbackFactory = HttpBinFeignApiKtFallbackFactory::class,
)
interface HttpBinFeignApiKt {
    @GetMapping("/status/{code}")
    fun status(@PathVariable code: Int): JsonNode

    @GetMapping("/get")
    fun get(): JsonNode

    @GetMapping("/delay/{seconds}")
    fun delay(@PathVariable seconds: Int): JsonNode
}

@Component
class HttpBinFeignApiKtFallbackFactory(private val objectMapper: ObjectMapper) : FallbackFactory<HttpBinFeignApiKt> {
    override fun create(cause: Throwable): HttpBinFeignApiKt {
        return object : HttpBinFeignApiKt {
            override fun status(code: Int): JsonNode {
                return objectMapper.createObjectNode().put("status", "fallback")
            }

            override fun get(): JsonNode {
                return objectMapper.createObjectNode().put("get", "fallback")
            }

            override fun delay(seconds: Int): JsonNode {
                return objectMapper.createObjectNode().put("delay", "fallback")
            }
        }
    }
}
