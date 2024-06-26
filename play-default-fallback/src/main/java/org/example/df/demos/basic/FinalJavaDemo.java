package org.example.df.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doDefaultFallback;
import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: annotation-base bean (final class); annotation on method; fallback in current class
 * <br/>
 * Application bootstrap failed.
 */
// @Component // Enable this line will cause the application bootstrap failed.
@SuppressWarnings({"unused"})
@Slf4j
public final class FinalJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
