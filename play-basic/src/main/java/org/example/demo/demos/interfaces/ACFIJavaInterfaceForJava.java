package org.example.demo.demos.interfaces;

import static org.example.demo.biz.Greeting.doFallback;

/**
 * case interface: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but the fallback method can not be found.
 */
@SuppressWarnings("unused")
public interface ACFIJavaInterfaceForJava {
    String greeting(String name);

    default String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
