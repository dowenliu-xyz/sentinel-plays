package org.example.df.demos.handler.other;

import static org.example.df.biz.Greeting.doDefaultFallback;

@SuppressWarnings("unused")
public interface JavaHandlerInterfaceForKotlin {
    private static String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
