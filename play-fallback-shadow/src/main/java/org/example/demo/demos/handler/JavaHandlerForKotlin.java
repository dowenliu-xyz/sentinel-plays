package org.example.demo.demos.handler;

import static org.example.demo.biz.Greeting.doFallback;

public class JavaHandlerForKotlin {
    private static String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }

    private static String fallback(String name) {
        return doFallback(name);
    }
}
