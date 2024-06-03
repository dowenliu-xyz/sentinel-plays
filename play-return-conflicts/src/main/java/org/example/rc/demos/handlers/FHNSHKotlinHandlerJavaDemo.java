package org.example.rc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.rc.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.rc.biz.Biz.doFirst;
import static org.example.rc.biz.Biz.doSecond;

@Component
public class FHNSHKotlinHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = FHNSHKotlinHandlerForJava.class)
    @Override
    public String first() {
        return doFirst();
    }

    @SentinelResource(fallback = "fallback", fallbackClass = FHNSHKotlinHandlerForJava.class)
    @Override
    public Integer second() {
        return doSecond();
    }
}
