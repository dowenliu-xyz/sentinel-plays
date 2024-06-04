package org.example.cd.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doGreeting;

@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = KotlinHandlerInterfaceForJava.class)
public class KotlinHandlerInterfaceJavaDemo {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
