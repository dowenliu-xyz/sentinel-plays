package org.example.rc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.rc.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.rc.biz.Biz.*;

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

    @SentinelResource(fallback = "fallback", fallbackClass = FSSHJavaHandlerForJava.class)
    @Override
    public Integer second() {
        return doSecond();
    }
}
