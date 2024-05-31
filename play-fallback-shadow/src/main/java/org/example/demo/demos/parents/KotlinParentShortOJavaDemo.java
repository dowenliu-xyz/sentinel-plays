package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doFallback;
import static org.example.demo.biz.Greeting.doGreeting;

@Component
public class KotlinParentShortOJavaDemo extends KotlinParentShortOForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return doGreeting(name);
    }

    public String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }

    @NotNull
    @Override
    public String fallback(String name) {
        return doFallback(name);
    }
}
