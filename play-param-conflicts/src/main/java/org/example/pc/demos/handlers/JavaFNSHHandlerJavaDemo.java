package org.example.pc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.doConsumeInteger;
import static org.example.pc.biz.Biz.doConsumeString;

@Component
public class JavaFNSHHandlerJavaDemo implements Demo {
    @SentinelResource
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(
            blockHandler = "blockHandler", blockHandlerClass = JavaFNSHHandlerForJava.class,
            fallback = "fallback", fallbackClass = JavaFNSHHandlerForJava.class
    )
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
