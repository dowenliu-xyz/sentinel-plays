package org.example.rc.demos.handlers;

import static org.example.rc.biz.Biz.doSecondFallback;

/**
 * case: First fallback should in Handler class but Not provided; Second fallback in Handler class.
 * <br/>
 * Conflict. Second fallback hidden.
 */
public abstract class FHNSHJavaHandlerForJava {
    private static Integer fallback() {
        return doSecondFallback();
    }
}
