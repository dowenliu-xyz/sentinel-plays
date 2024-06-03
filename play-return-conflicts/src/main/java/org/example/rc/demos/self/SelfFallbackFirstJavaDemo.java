package org.example.rc.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.rc.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.rc.biz.Biz.*;

/**
 * case: first fallback in self class
 * <br/>
 * Conflict.
 */
@Component
public class SelfFallbackFirstJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback")
    @Override
    public String first() {
        return doFirst();
    }

    private String fallback() {
        return doFirstFallback();
    }

    @SentinelResource(fallback = "fallback")
    @Override
    public Integer second() {
        return doSecond();
    }
}
