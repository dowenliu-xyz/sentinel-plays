package org.example.basic.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.basic.biz.Greeting;
import org.springframework.stereotype.Component;

/**
 * case impl: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but CAN NOT find fallback method.
 */
@Component
public class ACFIJavaInterfaceJavaDemo implements ACFIJavaInterfaceForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    @Override
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
