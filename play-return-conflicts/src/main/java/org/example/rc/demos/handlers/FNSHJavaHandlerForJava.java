package org.example.rc.demos.handlers;

import static org.example.rc.biz.Biz.doSecondFallback;

/**
 * case: First fallback Not set; Second fallback in Handler class.
 * <br/>
 * Not conflict.
 */
public abstract class FNSHJavaHandlerForJava {
    private static Integer fallback() {
        return doSecondFallback();
    }
}
