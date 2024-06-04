package org.example.cd.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doGreeting;

// TODO 类上注解没有提示修改 visibility
@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = JavaHandlerInterfaceForJava.class)
public class JavaHandlerInterfaceJavaDemo {
    // TODO 接口的静态 handler 方法 visibility 不能修改为 protected
    @SentinelResource(value = "demo") // TODO 设置到方法上，修改一个方法的 visibility 后，另一个方法不提示修改 visibility 了
    public String greeting(String name) {
        return doGreeting(name);
    }
}
