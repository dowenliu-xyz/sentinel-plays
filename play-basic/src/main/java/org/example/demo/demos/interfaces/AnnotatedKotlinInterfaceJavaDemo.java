package org.example.demo.demos.interfaces;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doFallback;
import static org.example.demo.biz.Greeting.doGreeting;

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
        return doGreeting(name);
    }

    String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
