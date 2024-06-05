package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import static org.example.pc.biz.Biz.doBlockHandle;
import static org.example.pc.biz.Biz.doFallback;

/**
 * case: first fallback from handler class; second fallback from handler class
 * <br/>
 * Conflicts.
 * // TODO 没有提示冲突
 */
public class JavaFHSHHandlerForKotlin {
    private static void blockHandler(String str, BlockException e) {
        doBlockHandle(str, e);
    }

    private static void blockHandler(Integer integer, BlockException e) {
        doBlockHandle(integer, e);
    }

    private static void fallback(String str) {
        doFallback(str);
    }

    private static void fallback(Integer integer) {
        doFallback(integer);
    }
}
