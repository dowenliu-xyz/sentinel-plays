package org.example.df.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect.
 */
public class AUFPJavaParentForKotlin {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    public final String greeting(String name) {
        return doGreeting(name);
    }
}
