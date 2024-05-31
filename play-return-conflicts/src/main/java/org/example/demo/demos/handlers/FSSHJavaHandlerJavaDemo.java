package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.*;

@Component
public class FSSHJavaHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback")
    @Override
    public String first() {
        return doFirst();
    }

    private String fallback() {
        return doFirstFallback();
    }

    @SentinelResource(fallback = "fallback", fallbackClass = FSSHJavaHandlerForJava.class) // TODO 没有提示修改 visibility
    @Override
    public Integer second() {
        return doSecond();
    }
}
