package org.example.demo.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doDefaultFallback;
import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: annotation-base bean (final class); annotation on method; fallback in current class
 * <br/>
 * Application bootstrap failed.
 * TODO 现在插件未提示会导致启动失败
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
