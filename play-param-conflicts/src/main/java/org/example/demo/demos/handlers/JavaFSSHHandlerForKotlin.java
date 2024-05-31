package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doFallback;

/**
 * case: first fallback from self class; second fallback from handler class
 * <br/>
 * Not conflicts.
 */
public class JavaFSSHHandlerForKotlin {
    private static void fallback(Integer integer) {
        doFallback(integer);
    }
}
