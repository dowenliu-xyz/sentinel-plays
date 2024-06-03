package org.example.basic.demos.handler.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.basic.biz.Greeting.doFallback;
import static org.example.basic.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
public class SelfHandlersJavaDemo {
    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = SelfHandlersJavaDemo.class)
    public String greeting(String name) {
        return doGreeting(name);
    }

    private static String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
