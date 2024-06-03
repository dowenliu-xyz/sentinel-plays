package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

@Component
public class KotlinFHSSHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = KotlinFHSSHandlerForJava.class)
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
