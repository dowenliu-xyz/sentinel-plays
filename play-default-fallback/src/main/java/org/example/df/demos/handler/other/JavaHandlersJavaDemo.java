package org.example.df.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doGreeting;

@Component
public class JavaHandlersJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback", fallbackClass = JavaHandlersForJava.class)
    public String greeting(String name) {
        return doGreeting(name);
    }
}
