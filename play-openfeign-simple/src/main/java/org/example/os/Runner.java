package org.example.os;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.os.feign.HttpBinFeignApi;
import org.example.os.feign.HttpBinFeignApiKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {
    private final HttpBinFeignApi httpBinFeignApi;
    private final HttpBinFeignApiKt httpBinFeignApiKt;

    @SuppressWarnings("LoggingSimilarMessage")
    @Override
    public void run(String... args) {
        try {
            JsonNode resp = httpBinFeignApi.status(500);
            log.info("resp: {}", resp);
        } catch (Exception e) {
            log.error("error", e);
        }

        try {
            JsonNode resp = httpBinFeignApiKt.status(500);
            log.info("resp: {}", resp);
        } catch (Exception e) {
            log.error("error", e);
        }
    }
}
