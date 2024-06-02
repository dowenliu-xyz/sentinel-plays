package org.example.demo.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

@Component
public class KotlinHandlersJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback", fallbackClass = KotlinHandlersForJava.class)
    public String greeting(String name) {
        return doGreeting(name);
    }
}
