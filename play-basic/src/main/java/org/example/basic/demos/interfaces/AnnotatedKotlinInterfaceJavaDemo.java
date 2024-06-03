package org.example.basic.demos.interfaces;

import lombok.extern.slf4j.Slf4j;
import org.example.basic.biz.Greeting;
import org.springframework.stereotype.Component;

/**
 * case impl: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
@SuppressWarnings("unused")
@Component
@Slf4j
public class AnnotatedKotlinInterfaceJavaDemo implements AnnotatedKotlinInterfaceForJava {
    @Override
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }

    String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
