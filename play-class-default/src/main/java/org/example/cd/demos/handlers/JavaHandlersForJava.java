package org.example.cd.demos.handlers;

import static org.example.cd.biz.Greeting.doDefaultFallback;

// TODO 类注解时没的提示 shadow
public class JavaHandlersForJava {
    private static String defaultFallback() {
        return doDefaultFallback();
    }

    private static String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
