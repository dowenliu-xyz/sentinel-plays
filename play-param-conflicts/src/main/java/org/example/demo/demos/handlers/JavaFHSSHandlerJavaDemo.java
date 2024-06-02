package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.*;

@Component
public class JavaFHSSHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = JavaFHSSHandlerForJava.class)
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
