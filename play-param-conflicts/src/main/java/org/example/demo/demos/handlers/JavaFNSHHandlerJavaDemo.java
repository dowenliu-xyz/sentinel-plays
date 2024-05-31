package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.doConsumeInteger;
import static org.example.demo.biz.Biz.doConsumeString;

@Component
public class JavaFNSHHandlerJavaDemo implements Demo {
    @SentinelResource
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(fallback = "fallback", fallbackClass = JavaFNSHHandlerForJava.class) // TODO 没有提示修改 visibility
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
