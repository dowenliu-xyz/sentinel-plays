package org.example.rt;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {
    private final RestTemplate restTemplate;

    @Override
    public void run(String... args) {
        for (int i = 0; i < 10; i++) {
            try {
                String resp = restTemplate.getForObject("http://localhost:8011/status/500", String.class);
                log.info("{} resp: {}", String.format("%2d", i), resp);
//                Thread.sleep(200);
            } catch (Throwable t) {
                if (!BlockException.isBlockException(t)) {
                    log.error("exception, {}", i, t);
                    continue;
                }
                log.error("blockException, {}", i, t);
                break;
            }
        }
    }
}
