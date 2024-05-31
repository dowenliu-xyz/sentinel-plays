package org.example.demo.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

@Component
public class JavaHandlersJavaDemo {
    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = JavaHandlersForJava.class) // TODO 现在插件没有提供修正 visibility
    public String greeting(String name) {
        return doGreeting(name);
    }
}
