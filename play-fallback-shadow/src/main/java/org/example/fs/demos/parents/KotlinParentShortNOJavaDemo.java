package org.example.fs.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.fs.biz.Greeting.doFallback;
import static org.example.fs.biz.Greeting.doGreeting;

@Component
public class KotlinParentShortNOJavaDemo extends KotlinParentShortNOForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return doGreeting(name);
    }

    public String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
