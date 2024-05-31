package org.example.demo.demos.handler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

@Component
public class JavaHandlerJavaDemo {
    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = JavaHandlerForJava.class) // TODO 没有提示修正 visibility
    public String greeting(String name) {
        return doGreeting(name);
    }
}
