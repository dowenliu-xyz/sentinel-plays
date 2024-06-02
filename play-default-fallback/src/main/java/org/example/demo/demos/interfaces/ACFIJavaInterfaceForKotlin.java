package org.example.demo.demos.interfaces;

import static org.example.demo.biz.Greeting.doDefaultFallback;

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
@SuppressWarnings("unused")
public interface ACFIJavaInterfaceForKotlin {
    String greeting(String name);

    default String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
