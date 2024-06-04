package org.example.df.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect.
 */
public class AUFPJavaParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback") // TODO 提示注解无效，还检查了 defaultFallback
    public final String greeting(String name) {
        return doGreeting(name);
    }
}
