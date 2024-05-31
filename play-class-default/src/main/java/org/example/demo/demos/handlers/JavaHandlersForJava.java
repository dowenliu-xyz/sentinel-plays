package org.example.demo.demos.handlers;

import static org.example.demo.biz.Greeting.doDefaultFallback;

public class JavaHandlersForJava {
    private static String defaultFallback() {
        return doDefaultFallback();
    }

    private static String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
