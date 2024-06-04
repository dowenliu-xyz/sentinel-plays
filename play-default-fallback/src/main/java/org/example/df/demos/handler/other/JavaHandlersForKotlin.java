package org.example.df.demos.handler.other;

import static org.example.df.biz.Greeting.doDefaultFallback;

@SuppressWarnings("unused")
public class JavaHandlersForKotlin {
    private static String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
