package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doFallback;

/**
 * case: first fallback from handler class; second fallback not provided
 * <br/>
 * Not Conflicts.
 */
public class JavaFHSNHandlerForKotlin {
    private static void fallback(String str) {
        doFallback(str);
    }
}
