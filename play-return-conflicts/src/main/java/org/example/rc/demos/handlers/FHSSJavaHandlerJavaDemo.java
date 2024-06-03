package org.example.rc.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.rc.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.rc.biz.Biz.*;

@Component
public class FHSSJavaHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = FHSSJavaHandlerForJava.class)
    @Override
    public String first() {
        return doFirst();
    }

    @SentinelResource(fallback = "fallback")
    @Override
    public Integer second() {
        return doSecond();
    }

    private Integer fallback() {
        return doSecondFallback();
    }
}
