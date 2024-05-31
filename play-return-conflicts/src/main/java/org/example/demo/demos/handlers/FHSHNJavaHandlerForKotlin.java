package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doFirstFallback;

/**
 * case: First fallback in Handler class; Second fallback should in Handler class, but Not provided.
 * <br/>
 * Conflict.
 */
public abstract class FHSHNJavaHandlerForKotlin {
    private static String fallback() {
        return doFirstFallback();
    }
}
