package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.doConsumeInteger;
import static org.example.pc.biz.Biz.doConsumeString;

@Component
public class KotlinFHSNHandlerJavaDemo implements Demo {
    @SentinelResource(
            blockHandler = "blockHandler", blockHandlerClass = KotlinFHSNHandlerForJava.class,
            fallback = "fallback", fallbackClass = KotlinFHSNHandlerForJava.class
    )
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
