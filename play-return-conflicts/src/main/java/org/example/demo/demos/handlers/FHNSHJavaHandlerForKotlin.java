package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doSecondFallback;

/**
 * case: First fallback should in Handler class but Not provided; Second fallback in Handler class.
 * <br/>
 * Conflict. Second fallback hidden.
 */
public abstract class FHNSHJavaHandlerForKotlin {
    private static Integer fallback() {
        return doSecondFallback();
    }
}
