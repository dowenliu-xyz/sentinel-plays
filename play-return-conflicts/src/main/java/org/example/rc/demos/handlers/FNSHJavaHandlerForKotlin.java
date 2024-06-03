package org.example.rc.demos.handlers;

import static org.example.rc.biz.Biz.doSecondFallback;

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
