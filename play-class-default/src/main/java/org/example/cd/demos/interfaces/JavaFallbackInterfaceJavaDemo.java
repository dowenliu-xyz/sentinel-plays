package org.example.cd.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: interface with default fallback method
 * <br/>
 * Aspect takes effect, but the defaultFallback method can not be found.
 */
@Component
@SentinelResource(defaultFallback = "defaultFallback")
// TODO 不应该解析出 接口上的方法。画蛇添足。
public class JavaFallbackInterfaceJavaDemo implements JavaFallbackInterfaceForJava {
    @SentinelResource(value = "demo") // TODO 方法设置 defaultFallback 后也不应该解析出接口上的方法。画蛇添足
    public String greeting(String name) {
        return doGreeting(name);
    }
}
