package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doFirstFallback;

/**
 * case: First fallback in Handler class; Second fallback Not set.
 * <br/>
 * Not conflict.
 */
public abstract class FHSNJavaHandlerForKotlin {
    private static String fallback() {
        return doFirstFallback();
    }
}
