package org.example.demo.demos.interfaces;

import static org.example.demo.biz.Greeting.doDefaultFallback;

public interface JavaFallbackInterfaceForJava {
    default String defaultFallback() {
        return doDefaultFallback();
    }

    default String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
