package org.example.demo.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.*;

/**
 * case: nether first nor second fallback provided
 * <br/>
 * Not conflict. The first fallback register a null method, and the second fallback happens to not exist either.
 */
@Component
public class SelfNoneFallbackJavaDemo implements Demo {
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
}
