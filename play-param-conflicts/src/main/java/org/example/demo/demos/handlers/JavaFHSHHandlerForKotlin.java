package org.example.demo.demos.handlers;

import static org.example.demo.biz.Biz.doFallback;

/**
 * case: first fallback from handler class; second fallback from handler class
 * <br/>
 * Conflicts.
 * // TODO 没有提示冲突
 */
public class JavaFHSHHandlerForKotlin {
    private static void fallback(String str) {
        doFallback(str);
    }

    private static void fallback(Integer integer) {
        doFallback(integer);
    }
}
