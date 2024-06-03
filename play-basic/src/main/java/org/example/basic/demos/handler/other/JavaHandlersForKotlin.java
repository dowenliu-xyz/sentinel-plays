package org.example.basic.demos.handler.other;

import lombok.extern.slf4j.Slf4j;
import org.example.basic.biz.Greeting;

@SuppressWarnings("unused")
@Slf4j
public class JavaHandlersForKotlin {
    private static String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
