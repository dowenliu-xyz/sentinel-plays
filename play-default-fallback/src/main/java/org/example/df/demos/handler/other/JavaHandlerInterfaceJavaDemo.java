package org.example.df.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doGreeting;

@Component
public class JavaHandlerInterfaceJavaDemo {
    // TODO 接口的静态 handler 方法 visibility 不能修改为 protected
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback", fallbackClass = JavaHandlerInterfaceForJava.class)
    public String greeting(String name) {
        return doGreeting(name);
    }
}
