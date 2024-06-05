package org.example.pc.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

/**
 * case: second fallback provided, but first not
 * <br/>
 * Second fallback hidden. Treat as a conflict
 */
@Component
public class SelfSecondFallbackJavaDemo implements Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }

    private void blockHandler(@Nullable Integer integer, BlockException e) {
        doBlockHandle(integer, e);
    }

    private void fallback(Integer integer) {
        doFallback(integer);
    }
}
