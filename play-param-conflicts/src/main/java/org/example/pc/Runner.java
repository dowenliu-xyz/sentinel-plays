package org.example.pc;

import lombok.RequiredArgsConstructor;
import org.example.pc.biz.Demo;
import org.example.pc.demos.handlers.*;
import org.example.pc.demos.self.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final SelfBothFallbackJavaDemo selfBothFallbackJavaDemo;
    private final SelfBothFallbackKotlinDemo selfBothFallbackKotlinDemo;
    private final SelfFirstFallbackJavaDemo selfFirstFallbackJavaDemo;
    private final SelfFirstFallbackKotlinDemo selfFirstFallbackKotlinDemo;
    private final SelfSecondFallbackJavaDemo selfSecondFallbackJavaDemo;
    private final SelfSecondFallbackKotlinDemo selfSecondFallbackKotlinDemo;
    private final SelfNoneFallbackJavaDemo selfNoneFallbackJavaDemo;
    private final SelfNoneFallbackKotlinDemo selfNoneFallbackKotlinDemo;
    private final JavaFHSHHandlerJavaDemo javaFHSHHandlerJavaDemo;
    private final JavaFHSHHandlerKotlinDemo javaFHSHHandlerKotlinDemo;
    private final KotlinFHSHHandlerJavaDemo kotlinFHSHHandlerJavaDemo;
    private final KotlinFHSHHandlerKotlinDemo kotlinFHSHHandlerKotlinDemo;
    private final JavaFHSNHandlerJavaDemo javaFHSNHandlerJavaDemo;
    private final JavaFHSNHandlerKotlinDemo javaFHSNHandlerKotlinDemo;
    private final KotlinFHSNHandlerJavaDemo kotlinFHSNHandlerJavaDemo;
    private final KotlinFHSNHandlerKotlinDemo kotlinFHSNHandlerKotlinDemo;
    private final JavaFHSSHandlerJavaDemo javaFHSSHandlerJavaDemo;
    private final JavaFHSSHandlerKotlinDemo javaFHSSHandlerKotlinDemo;
    private final KotlinFHSSHandlerJavaDemo kotlinFHSSHandlerJavaDemo;
    private final KotlinFHSSHandlerKotlinDemo kotlinFHSSHandlerKotlinDemo;
    private final JavaFNSHHandlerJavaDemo javaFNSHHandlerJavaDemo;
    private final JavaFNSHHandlerKotlinDemo javaFNSHHandlerKotlinDemo;
    private final KotlinFNSHHandlerJavaDemo kotlinFNSHHandlerJavaDemo;
    private final KotlinFNSHHandlerKotlinDemo kotlinFNSHHandlerKotlinDemo;
    private final JavaFSSHHandlerJavaDemo javaFSSHHandlerJavaDemo;
    private final JavaFSSHHandlerKotlinDemo javaFSSHHandlerKotlinDemo;
    private final KotlinFSSHHandlerJavaDemo kotlinFSSHHandlerJavaDemo;
    private final KotlinFSSHHandlerKotlinDemo kotlinFSSHHandlerKotlinDemo;

    @Override
    public void run(String... args) {
        {
            expectSecondCallConflict(selfBothFallbackJavaDemo);
            expectSecondCallConflict(selfBothFallbackKotlinDemo);
            expectSecondCallConflict(selfFirstFallbackJavaDemo);
            expectSecondCallConflict(selfFirstFallbackKotlinDemo);
            expectSecondCallNoFallback(selfSecondFallbackJavaDemo);
            expectSecondCallNoFallback(selfSecondFallbackKotlinDemo);
            expectSecondCallNoFallback(selfNoneFallbackJavaDemo);
            expectSecondCallNoFallback(selfNoneFallbackKotlinDemo);
        }
        {
            expectSecondCallConflict(javaFHSHHandlerJavaDemo);
            expectSecondCallConflict(javaFHSHHandlerKotlinDemo);
            expectSecondCallConflict(kotlinFHSHHandlerJavaDemo);
            expectSecondCallConflict(kotlinFHSHHandlerKotlinDemo);
            expectSecondCallNoFallback(javaFHSNHandlerJavaDemo);
            expectSecondCallNoFallback(javaFHSNHandlerKotlinDemo);
            expectSecondCallNoFallback(kotlinFHSNHandlerJavaDemo);
            expectSecondCallNoFallback(kotlinFHSNHandlerKotlinDemo);
            expectSecondCallFallback(javaFHSSHandlerJavaDemo);
            expectSecondCallFallback(javaFHSSHandlerKotlinDemo);
            expectSecondCallFallback(kotlinFHSSHandlerJavaDemo);
            expectSecondCallFallback(kotlinFHSSHandlerKotlinDemo);
            expectSecondCallFallback(javaFNSHHandlerJavaDemo);
            expectSecondCallFallback(javaFNSHHandlerKotlinDemo);
            expectSecondCallFallback(kotlinFNSHHandlerJavaDemo);
            expectSecondCallFallback(kotlinFNSHHandlerKotlinDemo);
            expectSecondCallFallback(javaFSSHHandlerJavaDemo);
            expectSecondCallFallback(javaFSSHHandlerKotlinDemo);
            expectSecondCallFallback(kotlinFSSHHandlerJavaDemo);
            expectSecondCallFallback(kotlinFSSHHandlerKotlinDemo);
        }
    }

    private static void expectSecondCallConflict(Demo demo) {
        try {
            demo.consumeString("");
        } catch (Throwable ignored) {
        }
        try {
            demo.consumeInteger(0);
        } catch (IllegalArgumentException e) {
            if ("argument type mismatch".equals(e.getMessage())) return;
            throw e;
        }
    }

    private static void expectSecondCallNoFallback(Demo demo) {
        try {
            demo.consumeString("");
        } catch (Throwable ignored) {
        }
        try {
            demo.consumeInteger(0);
        } catch (IllegalArgumentException e) {
            if ("integer should not be null".equals(e.getMessage())) return;
            throw e;
        }
    }

    private static void expectSecondCallFallback(Demo demo) {
        try {
            demo.consumeString("");
        } catch (Throwable ignored) {
        }
        demo.consumeInteger(0);
    }
}
