package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doFallback;

/**
 * case: first fallback from handler class; second fallback from self class
 * <br/>
 * Not Conflicts.
 */
public class JavaFHSSHandlerForKotlin {
    private static void fallback(String str) {
        doFallback(str);
    }
}
