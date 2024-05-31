package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doSecondFallback;

/**
 * case: First fallback in Self class; Second fallback in Handler class.
 * <br/>
 * Not conflict.
 */
public abstract class FSSHJavaHandlerForJava {
    private static Integer fallback() {
        return doSecondFallback();
    }
}
