package org.example.pc.demos.handlers;

import static org.example.pc.biz.Biz.doFallback;

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
