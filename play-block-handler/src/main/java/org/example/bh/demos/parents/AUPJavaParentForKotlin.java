package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.bh.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForKotlin {
    @SentinelResource(value = "demo", blockHandler = "blockHandler") // TODO 成功解析到子类方法，但检查有问题：未找到方法
    public String greeting(String name) {
        return doGreeting(name);
    }
}