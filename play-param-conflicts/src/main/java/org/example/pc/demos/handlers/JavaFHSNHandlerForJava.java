package org.example.pc.demos.handlers;

import static org.example.pc.biz.Biz.doFallback;

/**
 * case: first fallback from handler class; second fallback not provided
 * <br/>
 * Not Conflicts.
 */
public class JavaFHSNHandlerForJava {
    private static void fallback(String str) {
        doFallback(str);
    }
}
