package org.example.df.demos.interfaces;

import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doDefaultFallback;
import static org.example.df.biz.Greeting.doGreeting;

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
        return doGreeting(name);
    }

    String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
