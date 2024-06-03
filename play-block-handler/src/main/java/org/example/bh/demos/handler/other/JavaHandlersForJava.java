package org.example.bh.demos.handler.other;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

import static org.example.bh.biz.Greeting.doBlockHandle;

@SuppressWarnings("unused")
@Slf4j
public class JavaHandlersForJava {
    private static String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
