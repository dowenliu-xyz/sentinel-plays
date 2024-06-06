package org.example.df.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
