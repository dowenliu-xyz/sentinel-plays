package org.example.pc.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

/**
 * case: both first and second fallback provided
 * <br/>
 * Conflicts.
 */
@Component
public class SelfBothFallbackJavaDemo implements Demo {
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

    private void fallback(String str) {
        doFallback(str);
    }

    private void fallback(Integer integer) {
        doFallback(integer);
    }
}