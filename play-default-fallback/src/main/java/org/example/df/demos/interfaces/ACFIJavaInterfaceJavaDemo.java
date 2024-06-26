package org.example.df.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doGreeting;

/**
 * case impl: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but CAN NOT find fallback method.
 */
@Component
public class ACFIJavaInterfaceJavaDemo implements ACFIJavaInterfaceForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }
}
