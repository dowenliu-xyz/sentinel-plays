package org.example.pc.demos.handlers;

import static org.example.pc.biz.Biz.doFallback;

/**
 * case: first fallback not provided; second fallback from handler class
 * <br/>
 * Not conflicts.
 */
public class JavaFNSHHandlerForKotlin {
    private static void fallback(Integer integer) {
        doFallback(integer);
    }
}
