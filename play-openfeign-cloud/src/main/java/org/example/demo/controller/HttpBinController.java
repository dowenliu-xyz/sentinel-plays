package org.example.demo.controller;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.example.demo.feign.HttpBinFeignApi;
import org.example.demo.feign.HttpBinFeignApiKt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HttpBinController {
    private final HttpBinFeignApi httpBinFeignApi;
    private final HttpBinFeignApiKt httpBinFeignApiKt;

    @GetMapping("/status/{code}")
    public JsonNode status(@PathVariable("code") int code) {
        return httpBinFeignApi.status(code);
    }

    @GetMapping("/statusKt/{code}")
    public JsonNode statusKt(@PathVariable("code") int code) {
        return httpBinFeignApiKt.status(code);
    }
}
