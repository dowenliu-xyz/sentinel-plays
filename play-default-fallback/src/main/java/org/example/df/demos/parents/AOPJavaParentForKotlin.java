package org.example.df.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: Annotated Overridden Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect. Because method is overridden.
 */
public class AOPJavaParentForKotlin {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
