package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

@Component
public class KotlinFSSHHandlerJavaDemo implements Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    private void blockHandler(String str, BlockException e) {
        doBlockHandle(str, e);
    }

    private void fallback(@Nullable String str) {
        doFallback(str);
    }

    @SentinelResource(
            blockHandler = "blockHandler", blockHandlerClass = KotlinFSSHHandlerForJava.class,
            fallback = "fallback", fallbackClass = KotlinFSSHHandlerForJava.class
    )
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
