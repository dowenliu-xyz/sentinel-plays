package org.example.bh.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doGreeting;

@Component
public class JavaHandlersJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "blockHandler", blockHandlerClass = JavaHandlersForJava.class)
    public String greeting(String name) {
        return doGreeting(name);
    }
}
