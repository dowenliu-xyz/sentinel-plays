package org.example.fs.demos.handler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.fs.biz.Greeting.doGreeting;

@Component
public class KotlinHandlerJavaDemo {
    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = KotlinHandlerForJava.class)
    public String greeting(String name) {
        return doGreeting(name);
    }
}
