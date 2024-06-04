package org.example.bh.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.bh.biz.Greeting;
import org.springframework.stereotype.Component;

@Component
public class KotlinHandlerInterfaceJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "blockHandle", blockHandlerClass = KotlinHandlerInterfaceForJava.class)
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
