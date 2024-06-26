package org.example.pc.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

/**
 * case: nether first nor second fallback provided
 * <br/>
 * Not conflict. The first fallback register a null method, and the second fallback happens to not exist either.
 */
@Component
public class SelfNoneFallbackJavaDemo implements Demo {
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
}
