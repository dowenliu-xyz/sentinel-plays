package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

// TODO 类上注解没有提示修改 visibility
@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = KotlinHandlersForJava.class)
public class KotlinHandlersJavaDemo {
    @SentinelResource(value = "demo") // TODO 设置到方法上，修改一个方法的 visibility 后，另一个方法不提示修改 visibility 了
    public String greeting(String name) {
        return doGreeting(name);
    }
}
