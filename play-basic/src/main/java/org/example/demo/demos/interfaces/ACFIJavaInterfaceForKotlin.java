package org.example.demo.demos.interfaces;

import static org.example.demo.biz.Greeting.doFallback;

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
@SuppressWarnings("unused")
public interface ACFIJavaInterfaceForKotlin {
    String greeting(String name);

    default String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
