package org.example.cd.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on interface class
 * <br/>
 * Aspect DOES NOT take effect, defaultFallback does not take effect.
 */
@Component
public class JavaAnnotatedInterfaceJavaDemo implements JavaAnnotatedInterfaceForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback() {
        return doDefaultFallback();
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
