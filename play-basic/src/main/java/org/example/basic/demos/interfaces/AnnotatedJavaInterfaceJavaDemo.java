package org.example.basic.demos.interfaces;

import org.example.basic.biz.Greeting;
import org.springframework.stereotype.Component;

/**
 * case impl: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
@SuppressWarnings("unused")
@Component
public class AnnotatedJavaInterfaceJavaDemo implements AnnotatedJavaInterfaceForJava {
    @Override
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }

    String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
