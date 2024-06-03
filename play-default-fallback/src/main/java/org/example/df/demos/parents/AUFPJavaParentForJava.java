package org.example.df.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect.
 * TODO 现在插件没有提示失效
 */
public class AUFPJavaParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    public final String greeting(String name) {
        return doGreeting(name);
    }
}