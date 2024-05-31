package org.example.demo.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.*;

/**
 * case: second fallback in self class
 * <br/>
 * Conflict. Second fallback hidden.
 */
@Component
public class SelfFallbackSecondJavaDemo implements Demo {
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

    private Integer fallback() {
        return doSecondFallback();
    }
}
