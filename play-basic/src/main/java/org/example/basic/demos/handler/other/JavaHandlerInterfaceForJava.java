package org.example.basic.demos.handler.other;

import org.example.basic.biz.Greeting;

public interface JavaHandlerInterfaceForJava {
    private static String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
