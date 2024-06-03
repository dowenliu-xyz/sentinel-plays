package org.example.rc.demos.handlers;

import static org.example.rc.biz.Biz.doFirstFallback;

/**
 * case: First fallback in Handler class; Second fallback should in Handler class, but Not provided.
 * <br/>
 * Conflict.
 */
public abstract class FHSHNJavaHandlerForJava {
    private static String fallback() {
        return doFirstFallback();
    }
}
