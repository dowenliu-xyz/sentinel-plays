package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.doConsumeInteger;
import static org.example.pc.biz.Biz.doConsumeString;

@Component
public class KotlinFNSHHandlerJavaDemo implements Demo {
    @SentinelResource
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(fallback = "fallback", fallbackClass = KotlinFNSHHandlerForJava.class)
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
