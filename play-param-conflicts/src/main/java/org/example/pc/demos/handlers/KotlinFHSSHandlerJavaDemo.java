package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

@Component
public class KotlinFHSSHandlerJavaDemo implements Demo {
    @SentinelResource(
            blockHandler = "blockHandler", blockHandlerClass = KotlinFHSSHandlerForJava.class,
            fallback = "fallback", fallbackClass = KotlinFHSSHandlerForJava.class
    )
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }

    private void blockHandler(Integer integer, BlockException e) {
        doBlockHandle(integer, e);
    }

    private void fallback(Integer integer) {
        doFallback(integer);
    }
}
