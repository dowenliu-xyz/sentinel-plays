package org.example.df.demos.interfaces;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class AnnotatedKotlinInterfaceJavaDemo implements AnnotatedKotlinInterfaceForJava {
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
