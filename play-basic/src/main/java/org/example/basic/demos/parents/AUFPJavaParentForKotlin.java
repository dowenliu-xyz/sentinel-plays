package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.basic.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect.
 * TODO 现在插件没有提示失效
 */
public class AUFPJavaParentForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback")
    public final String greeting(String name) {
        return doGreeting(name);
    }
}