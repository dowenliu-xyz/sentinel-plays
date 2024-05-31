package org.example.demo.demos.handler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

@Component
public class KotlinHandlerJavaDemo {
    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = KotlinHandlerForJava.class) // TODO 没有提示所有的方法修正 visibility
    public String greeting(String name) {
        return doGreeting(name);
    }
}
