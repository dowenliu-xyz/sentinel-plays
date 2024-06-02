package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.doConsumeInteger;
import static org.example.demo.biz.Biz.doConsumeString;

@Component
public class JavaFHSHHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = JavaFHSHHandlerForJava.class) // TODO 重命名 quickfix 没有改本地引用值
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(fallback = "fallback", fallbackClass = JavaFHSHHandlerForJava.class) // TODO 重命名 quickfix 没有改本地引用值
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
