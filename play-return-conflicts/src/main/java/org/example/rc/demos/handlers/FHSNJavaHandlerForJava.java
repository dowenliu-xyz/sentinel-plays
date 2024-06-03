package org.example.rc.demos.handlers;

import static org.example.rc.biz.Biz.doFirstFallback;

/**
 * case: First fallback in Handler class; Second fallback Not set.
 * <br/>
 * Not conflict.
 */
public abstract class FHSNJavaHandlerForJava {
    private static String fallback() {
        return doFirstFallback();
    }
}
