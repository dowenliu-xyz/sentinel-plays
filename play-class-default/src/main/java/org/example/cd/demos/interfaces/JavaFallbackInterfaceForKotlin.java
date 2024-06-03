package org.example.cd.demos.interfaces;

import static org.example.cd.biz.Greeting.doDefaultFallback;

public interface JavaFallbackInterfaceForKotlin {
    default String defaultFallback() {
        return doDefaultFallback();
    }

    default String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
