package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.basic.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect.
 */
public class AUFPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    // NOTES the `final` keyword in the next line!
    public final String greeting(String name) {
        return doGreeting(name);
    }
}
