package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.*;

@Component
public class FSSHKotlinHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback")
    @Override
    public String first() {
        return doFirst();
    }

    private String fallback() {
        return doFirstFallback();
    }

    @SentinelResource(fallback = "fallback", fallbackClass = FSSHKotlinHandlerForJava.class)
    @Override
    public Integer second() {
        return doSecond();
    }
}
