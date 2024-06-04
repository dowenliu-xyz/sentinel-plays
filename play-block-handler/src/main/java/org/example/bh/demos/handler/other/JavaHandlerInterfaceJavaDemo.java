package org.example.bh.demos.handler.other;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.bh.biz.Greeting;
import org.springframework.stereotype.Component;

@Component
public class JavaHandlerInterfaceJavaDemo {
    // TODO 接口的静态 handler 方法 visibility 不能修改为 protected
    @SentinelResource(value = "demo", blockHandler = "blockHandle", blockHandlerClass = JavaHandlerInterfaceForJava.class)
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
