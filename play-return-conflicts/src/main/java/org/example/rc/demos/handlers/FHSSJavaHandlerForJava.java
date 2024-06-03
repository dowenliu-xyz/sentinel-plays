package org.example.rc.demos.handlers;

import static org.example.rc.biz.Biz.doFirstFallback;

/**
 * case: First fallback in Handler class; Second fallback in Self class.
 * <br/>
 * Not conflict.
 */
public abstract class FHSSJavaHandlerForJava {
    private static String fallback() {
        return doFirstFallback();
    }
}
