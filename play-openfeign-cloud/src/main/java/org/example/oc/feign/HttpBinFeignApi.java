package org.example.oc.feign;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign client, always jdk-proxied bean.
 */
@FeignClient(
        name = "httpBin",
        // url = "https://httpbin.org"
        url = "http://localhost:8011",
        fallbackFactory = HttpBinFeignApi.FallbackFactory.class
)
// TODO request handler resource name 不应该在 FeignClient 里提示，应该限制在 Controller 里
public interface HttpBinFeignApi {
    @GetMapping("/status/{code}")
    JsonNode status(@PathVariable int code);

    @GetMapping("/get")
    JsonNode get();

    @GetMapping("/delay/{seconds}")
    JsonNode delay(@PathVariable int seconds);

    @Component
    @RequiredArgsConstructor
    class FallbackFactory implements org.springframework.cloud.openfeign.FallbackFactory<HttpBinFeignApi> {
        private final ObjectMapper objectMapper;

        @Override
        public HttpBinFeignApi create(Throwable cause) {
            return new HttpBinFeignApi() {
                @Override
                public JsonNode status(int code) {
                    return objectMapper.createObjectNode().put("fallback", true);
                }

                @Override
                public JsonNode get() {
                    return objectMapper.createObjectNode().put("fallback", true);
                }

                @Override
                public JsonNode delay(int seconds) {
                    return objectMapper.createObjectNode().put("fallback", true);
                }
            };
        }
    }
}
