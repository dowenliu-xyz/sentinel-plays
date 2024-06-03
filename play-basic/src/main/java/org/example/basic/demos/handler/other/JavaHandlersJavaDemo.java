package org.example.basic.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.basic.biz.Greeting;
import org.springframework.stereotype.Component;

@Component
public class JavaHandlersJavaDemo {
    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = JavaHandlersForJava.class)
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
