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
public class JavaFallbackInterfaceJavaDemo implements JavaFallbackInterfaceForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
