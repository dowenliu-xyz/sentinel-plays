package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import static org.example.pc.biz.Biz.doBlockHandle;
import static org.example.pc.biz.Biz.doFallback;

/**
 * case: first fallback from self class; second fallback from handler class
 * <br/>
 * Not conflicts.
 */
public class JavaFSSHHandlerForJava {
    private static void blockHandler(Integer integer, BlockException e) {
        doBlockHandle(integer, e);
    }

    private static void fallback(Integer integer) {
        doFallback(integer);
    }
}
