package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 成功解析到子类方法，但检查有问题：未找到方法
    public String greeting(String name) {
        return doGreeting(name);
    }
}
