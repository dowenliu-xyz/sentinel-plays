package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doFallback;

/**
 * case: first fallback not provided; second fallback from handler class
 * <br/>
 * Not conflicts.
 */
public class JavaFNSHHandlerForJava {
    private static void fallback(Integer integer) {
        doFallback(integer);
    }
}
