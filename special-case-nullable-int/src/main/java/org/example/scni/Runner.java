package org.example.scni;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {
    private final Case myCase;

    @Override
    public void run(String... args) {
        log.info("get: {}", myCase.getInt());
    }
}
