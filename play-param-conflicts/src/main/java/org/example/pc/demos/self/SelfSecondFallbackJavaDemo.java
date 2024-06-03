package org.example.pc.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

/**
 * case: second fallback provided, but first not
 * <br/>
 * Second fallback hidden. Treat as a conflict
 * TODO 没有提示冲突
 */
@Component
public class SelfSecondFallbackJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback")
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(fallback = "fallback")
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }

    private void fallback(Integer integer) {
        doFallback(integer);
    }
}
