package org.example.bh.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doGreeting;

@Component
public class KotlinHandlersJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "blockHandler", blockHandlerClass = KotlinHandlersForJava.class)
    public String greeting(String name) {
        return doGreeting(name);
    }
}
