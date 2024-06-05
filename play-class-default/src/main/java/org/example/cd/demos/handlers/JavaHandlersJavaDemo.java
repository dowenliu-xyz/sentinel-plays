package org.example.cd.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doGreeting;

// TODO 类上注解没有提示修改 visibility
@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = JavaHandlersForJava.class)
public class JavaHandlersJavaDemo {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
