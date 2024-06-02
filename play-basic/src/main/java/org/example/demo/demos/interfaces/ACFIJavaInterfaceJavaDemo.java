package org.example.demo.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

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
        return doGreeting(name);
    }
}
