package org.example.demo.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doFallback;
import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: annotation-base bean; annotation on class; fallback in current class
 * <br/>
 * aspect DOES NOT take effect, fallback does not take effect.
 */
@Component
@SuppressWarnings({"unused"})
@Slf4j
@SentinelResource(fallback = "fallback")
public class BasicClassJavaDemo {
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
