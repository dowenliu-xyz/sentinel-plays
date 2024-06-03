package org.example.df.demos.interfaces;

import static org.example.df.biz.Greeting.doDefaultFallback;

/**
 * case interface: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but the fallback method can not be found.
 */
@SuppressWarnings("unused")
public interface ACFIJavaInterfaceForJava {
    String greeting(String name);

    default String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
