package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doSecondFallback;

/**
 * case: First fallback Not set; Second fallback in Handler class.
 * <br/>
 * Not conflict.
 */
public abstract class FNSHJavaHandlerForKotlin {
    private static Integer fallback() {
        return doSecondFallback();
    }
}
