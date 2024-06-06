package org.example.cd.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doGreeting;

@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = JavaHandlerInterfaceForJava.class)
public class JavaHandlerInterfaceJavaDemo {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
