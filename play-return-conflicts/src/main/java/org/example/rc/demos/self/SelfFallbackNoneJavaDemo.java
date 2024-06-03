package org.example.rc.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.rc.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.rc.biz.Biz.doFirst;
import static org.example.rc.biz.Biz.doSecond;

/**
 * case: no fallback in self class
 * <br/>
 * Not conflict.
 */
@Component
public class SelfFallbackNoneJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback")
    @Override
    public String first() {
        return doFirst();
    }

    @SentinelResource(fallback = "fallback")
    @Override
    public Integer second() {
        return doSecond();
    }
}
