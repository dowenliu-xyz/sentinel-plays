package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.*;

@Component
public class JavaFSSHHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback")
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    private void fallback(@Nullable String str) {
        doFallback(str);
    }

    @SentinelResource(fallback = "fallback", fallbackClass = JavaFSSHHandlerForJava.class)
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
