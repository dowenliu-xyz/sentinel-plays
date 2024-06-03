package org.example.df.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doDefaultFallback;
import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: annotation-base bean; annotation on method; fallback in current class
 * <br/>
 * aspect takes effect, fallback takes effect.
 */
@Component
@SuppressWarnings({"unused"})
public class BasicJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
