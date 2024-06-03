package org.example.pc.demos.handlers;

import static org.example.pc.biz.Biz.doFallback;

/**
 * case: first fallback from handler class; second fallback from handler class
 * <br/>
 * Conflicts.
 * // TODO 没有提示冲突
 */
public class JavaFHSHHandlerForJava {
    private static void fallback(String str) {
        doFallback(str);
    }

    private static void fallback(Integer integer) {
        doFallback(integer);
    }
}
