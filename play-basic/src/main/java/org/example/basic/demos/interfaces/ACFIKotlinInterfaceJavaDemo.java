package org.example.basic.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.example.basic.biz.Greeting;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

/**
 * case impl: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but CAN NOT find fallback method.
 */
@Component
@Slf4j
public class ACFIKotlinInterfaceJavaDemo implements ACFIKotlinInterfaceForJava {
    @NotNull
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
