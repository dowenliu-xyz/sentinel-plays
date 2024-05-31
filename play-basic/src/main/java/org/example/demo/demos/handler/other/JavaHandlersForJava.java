package org.example.demo.demos.handler.other;

import lombok.extern.slf4j.Slf4j;

import static org.example.demo.biz.Greeting.doFallback;

@SuppressWarnings("unused")
@Slf4j
public class JavaHandlersForJava {
    private static String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
