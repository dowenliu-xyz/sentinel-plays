package org.example.fs.demos.handler;

import static org.example.fs.biz.Greeting.doFallback;

public class JavaHandlerForKotlin {
    private static String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }

    private static String fallback(String name) {
        return doFallback(name);
    }
}
