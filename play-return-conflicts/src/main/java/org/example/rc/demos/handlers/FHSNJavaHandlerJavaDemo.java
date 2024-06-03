package org.example.rc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.rc.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.rc.biz.Biz.doFirst;
import static org.example.rc.biz.Biz.doSecond;

@Component
public class FHSNJavaHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = FHSNJavaHandlerForJava.class)
    @Override
    public String first() {
        return doFirst();
    }

    @SentinelResource
    @Override
    public Integer second() {
        return doSecond();
    }
}
