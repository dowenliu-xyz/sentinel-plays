package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect.
 * TODO 现在插件没有提示失效
 */
public class AUFPJavaParentForJava {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    public final String greeting(String name) {
        return doGreeting(name);
    }
}
