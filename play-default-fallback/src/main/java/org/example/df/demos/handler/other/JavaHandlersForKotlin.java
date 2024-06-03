package org.example.df.demos.handler.other;

import lombok.extern.slf4j.Slf4j;

import static org.example.df.biz.Greeting.doDefaultFallback;

@SuppressWarnings("unused")
@Slf4j
public class JavaHandlersForKotlin {
    private static String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}