package org.example.eff.fallback.combine.demos.case01;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@ConditionalOnProperty(name = "run.only", havingValue = "case01")
@Component
@Slf4j
@RequiredArgsConstructor
public class Case01Runner implements CommandLineRunner {
    private final Case01JavaSuperJavaInterfaceJavaDemo demo;

    @Override
    public void run(String... args) {
        log.info("first result: {}", demo.greeting("abc"));
        log.info("second result: {}", demo.greeting(""));
    }
}
