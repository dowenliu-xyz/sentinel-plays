package org.example.bh.demos.handler.other;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.bh.biz.Greeting;

public interface JavaHandlerInterfaceForKotlin {
    private static String blockHandle(String name, BlockException e) {
        return Greeting.doBlockHandle(name, e);
    }
}
