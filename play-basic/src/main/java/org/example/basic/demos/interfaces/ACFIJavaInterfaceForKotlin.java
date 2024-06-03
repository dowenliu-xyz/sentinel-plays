package org.example.basic.demos.interfaces;

import org.example.basic.biz.Greeting;

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
@SuppressWarnings("unused")
public interface ACFIJavaInterfaceForKotlin {
    String greeting(String name);

    default String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
