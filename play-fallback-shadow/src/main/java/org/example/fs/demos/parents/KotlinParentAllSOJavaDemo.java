package org.example.fs.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static org.example.fs.biz.Greeting.doFallback;
import static org.example.fs.biz.Greeting.doGreeting;

@Component
public class KotlinParentAllSOJavaDemo extends KotlinParentAllSOForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return doGreeting(name);
    }

    @Override
    @NotNull
    public String fallback(String name) {
        return doFallback(name);
    }
}
