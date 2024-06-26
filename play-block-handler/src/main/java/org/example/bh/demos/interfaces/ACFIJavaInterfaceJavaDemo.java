package org.example.bh.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doGreeting;

/**
 * case impl: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but CAN NOT find fallback method.
 */
@Component
public class ACFIJavaInterfaceJavaDemo implements ACFIJavaInterfaceForJava {
    // The method `blockHandler` exists in interface `ACFIJavaInterfaceForJava`.
    // But it is a DEFAULT method! A default method CAN NOT be used as a handler method.
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }
}
