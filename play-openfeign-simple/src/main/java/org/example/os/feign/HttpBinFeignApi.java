package org.example.os.feign;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign client, always jdk-proxied bean.
 */
@FeignClient(
        name = "httpBin",
        // url = "https://httpbin.org"
        url = "http://localhost:8011" // A `httpbin` app is running at this endpoint.
)
public interface HttpBinFeignApi {
    @GetMapping("/status/{code}")
//    @SentinelResource(value = "httpBinStatus")
    JsonNode status(@PathVariable int code);

    @GetMapping("/get")
    JsonNode get();

    @GetMapping("/delay/{seconds}")
    JsonNode delay(@PathVariable int seconds);
}
