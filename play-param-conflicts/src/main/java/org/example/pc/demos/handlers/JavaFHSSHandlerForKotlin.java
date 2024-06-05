package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import static org.example.pc.biz.Biz.doBlockHandle;
import static org.example.pc.biz.Biz.doFallback;

/**
 * case: first fallback from handler class; second fallback from self class
 * <br/>
 * Not Conflicts.
 */
public class JavaFHSSHandlerForKotlin {
    private static void blockHandler(String str, BlockException e) {
        doBlockHandle(str, e);
    }

    private static void fallback(String str) {
        doFallback(str);
    }
}
