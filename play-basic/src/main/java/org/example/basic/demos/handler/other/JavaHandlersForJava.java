package org.example.basic.demos.handler.other;

import org.example.basic.biz.Greeting;

@SuppressWarnings("unused")
public class JavaHandlersForJava {
    private static String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
