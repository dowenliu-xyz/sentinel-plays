package org.example.bh.demos.handler.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doBlockHandle;
import static org.example.bh.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
public class SelfHandlersJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "blockHandler", blockHandlerClass = SelfHandlersJavaDemo.class)
    public String greeting(String name) {
        return doGreeting(name);
    }

    private static String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
