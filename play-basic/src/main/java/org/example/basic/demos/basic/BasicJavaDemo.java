package org.example.basic.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.basic.biz.Greeting.doFallback;
import static org.example.basic.biz.Greeting.doGreeting;

/**
 * case: annotation-base bean; annotation on method; fallback in current class
 * <br/>
 * aspect takes effect, fallback takes effect.
 */
// Comment out the next line ↓, makes this class no more a Bean.
@Component
@SuppressWarnings({"unused"})
public class BasicJavaDemo {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
