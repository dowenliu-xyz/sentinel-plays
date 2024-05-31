package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.doConsumeInteger;
import static org.example.demo.biz.Biz.doConsumeString;

// TODO 重命名 quickfix 没有改本地引用值
@Component
public class KotlinFHSHHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = KotlinFHSHHandlerForJava.class)
    @Override
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    @SentinelResource(fallback = "fallback", fallbackClass = KotlinFHSHHandlerForJava.class)
    @Override
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }
}
