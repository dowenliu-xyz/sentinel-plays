package org.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.demo.biz.Demo;
import org.example.demo.demos.handlers.*;
import org.example.demo.demos.self.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@SuppressWarnings("LoggingSimilarMessage")
@Component
@RequiredArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {
    private final SelfFallbackFirstJavaDemo selfFallbackFirstJavaDemo;
    private final SelfFallbackFirstKotlinDemo selfFallbackFirstKotlinDemo;
    private final SelfFallbackSecondJavaDemo selfFallbackSecondJavaDemo;
    private final SelfFallbackSecondKotlinDemo selfFallbackSecondKotlinDemo;
    private final SelfFallbackNoneJavaDemo selfFallbackNoneJavaDemo;
    private final SelfFallbackNoneKotlinDemo selfFallbackNoneKotlinDemo;
    private final FHNSHJavaHandlerJavaDemo fhnshJavaHandlerJavaDemo;
    private final FHNSHJavaHandlerKotlinDemo fhnshJavaHandlerKotlinDemo;
    private final FHNSHKotlinHandlerJavaDemo fhnshKotlinHandlerJavaDemo;
    private final FHNSHKotlinHandlerKotlinDemo fhnshKotlinHandlerKotlinDemo;
    private final FHSHNJavaHandlerJavaDemo fhshnJavaHandlerJavaDemo;
    private final FHSHNJavaHandlerKotlinDemo fhshnJavaHandlerKotlinDemo;
    private final FHSHNKotlinHandlerJavaDemo fhshnKotlinHandlerJavaDemo;
    private final FHSHNKotlinHandlerKotlinDemo fhshnKotlinHandlerKotlinDemo;
    private final FHSNJavaHandlerJavaDemo fhsnJavaHandlerJavaDemo;
    private final FHSNJavaHandlerKotlinDemo fhsnJavaHandlerKotlinDemo;
    private final FHSNKotlinHandlerJavaDemo fhsnKotlinHandlerJavaDemo;
    private final FHSNKotlinHandlerKotlinDemo fhsnKotlinHandlerKotlinDemo;
    private final FHSSJavaHandlerJavaDemo fhssJavaHandlerJavaDemo;
    private final FHSSJavaHandlerKotlinDemo fhssJavaHandlerKotlinDemo;
    private final FHSSKotlinHandlerJavaDemo fhssKotlinHandlerJavaDemo;
    private final FHSSKotlinHandlerKotlinDemo fhssKotlinHandlerKotlinDemo;
    private final FNSHJavaHandlerJavaDemo fnshJavaHandlerJavaDemo;
    private final FNSHJavaHandlerKotlinDemo fnshJavaHandlerKotlinDemo;
    private final FNSHKotlinHandlerJavaDemo fnshKotlinHandlerJavaDemo;
    private final FNSHKotlinHandlerKotlinDemo fnshKotlinHandlerKotlinDemo;
    private final FSSHJavaHandlerJavaDemo fsshJavaHandlerJavaDemo;
    private final FSSHJavaHandlerKotlinDemo fsshJavaHandlerKotlinDemo;
    private final FSSHKotlinHandlerJavaDemo fsshKotlinHandlerJavaDemo;
    private final FSSHKotlinHandlerKotlinDemo fsshKotlinHandlerKotlinDemo;

    @Override
    public void run(String... args) {
        {
            expectSecondCallConflict(selfFallbackFirstJavaDemo);
            expectSecondCallConflict(selfFallbackFirstKotlinDemo);
            expectSecondCallNoFallback(selfFallbackSecondJavaDemo);
            expectSecondCallNoFallback(selfFallbackSecondKotlinDemo);
            expectSecondCallNoFallback(selfFallbackNoneJavaDemo);
            expectSecondCallNoFallback(selfFallbackNoneKotlinDemo);
        }
        {
            expectSecondCallNoFallback(fhnshJavaHandlerJavaDemo);
            expectSecondCallNoFallback(fhnshJavaHandlerKotlinDemo);
            expectSecondCallNoFallback(fhnshKotlinHandlerJavaDemo);
            expectSecondCallNoFallback(fhnshKotlinHandlerKotlinDemo);
            expectSecondCallConflict(fhshnJavaHandlerJavaDemo);
            expectSecondCallConflict(fhshnJavaHandlerKotlinDemo);
            expectSecondCallConflict(fhshnKotlinHandlerJavaDemo);
            expectSecondCallConflict(fhshnKotlinHandlerKotlinDemo);
            expectSecondCallNoFallback(fhsnJavaHandlerJavaDemo);
            expectSecondCallNoFallback(fhsnJavaHandlerKotlinDemo);
            expectSecondCallNoFallback(fhsnKotlinHandlerJavaDemo);
            expectSecondCallNoFallback(fhsnKotlinHandlerKotlinDemo);
            expectSecondCallFallback(fhssJavaHandlerJavaDemo);
            expectSecondCallFallback(fhssJavaHandlerKotlinDemo);
            expectSecondCallFallback(fhssKotlinHandlerJavaDemo);
            expectSecondCallFallback(fhssKotlinHandlerKotlinDemo);
            expectSecondCallFallback(fnshJavaHandlerJavaDemo);
            expectSecondCallFallback(fnshJavaHandlerKotlinDemo);
            expectSecondCallFallback(fnshKotlinHandlerJavaDemo);
            expectSecondCallFallback(fnshKotlinHandlerKotlinDemo);
            expectSecondCallFallback(fsshJavaHandlerJavaDemo);
            expectSecondCallFallback(fsshJavaHandlerKotlinDemo);
            expectSecondCallFallback(fsshKotlinHandlerJavaDemo);
            expectSecondCallFallback(fsshKotlinHandlerKotlinDemo);
        }
    }

    private static void expectSecondCallConflict(Demo demo) {
        try {
            String first = demo.first();
            log.debug("first: {}", first);
        } catch (Throwable ignored) {
        }
        try {
            Integer second = demo.second();
            log.error("second: {}", second);
        } catch (ClassCastException ignored) {
        }
    }

    private static void expectSecondCallNoFallback(Demo demo) {
        try {
            String first = demo.first();
            log.debug("first: {}", first);
        } catch (Throwable ignored) {
        }
        try {
            Integer second = demo.second();
            log.error("second: {}", second);
        } catch (IllegalStateException e) {
            if ("biz error".equals(e.getMessage())) return;
            throw e;
        }
    }

    private static void expectSecondCallFallback(Demo demo) {
        try {
            String first = demo.first();
            log.debug("first: {}", first);
        } catch (Throwable ignored) {
        }
        Integer second = demo.second();
        log.debug("second: {}", second);
    }
}
