package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.bh.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect.
 */
public class AUFPJavaParentForJava {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    public final String greeting(String name) {
        return doGreeting(name);
    }
}
