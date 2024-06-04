package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.bh.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForJava {
    @SentinelResource(value = "demo", blockHandler = "blockHandler") // TODO 自动完成有问题，好像是 IDE bug
    public String greeting(String name) {
        return doGreeting(name);
    }
}
