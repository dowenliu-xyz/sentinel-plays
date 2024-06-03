package org.example.os.feign

import com.fasterxml.jackson.databind.JsonNode
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "httpBinKt",
//     url = "https://httpbin.org",
    url = "http://127.0.0.1:8011",
)
interface HttpBinFeignApiKt {
    @GetMapping("/status/{code}")
    // @SentinelResource(value = "httpBinStatus") // TODO Enable this annotation cause IllegalStateException.
    fun status(@PathVariable code: Int): JsonNode

    @GetMapping("/get")
    fun get(): JsonNode

    @GetMapping("/delay/{seconds}")
    fun delay(@PathVariable seconds: Int): JsonNode
}
