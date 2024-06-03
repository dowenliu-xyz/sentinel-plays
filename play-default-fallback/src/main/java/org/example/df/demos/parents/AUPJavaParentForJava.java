package org.example.df.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.df.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback") // TODO 成功解析到子类方法，但检查有问题：未找到方法
    // TODO 检查两个子类 bean 时，解析、自动完成、检查，修正 visibility
    public String greeting(String name) {
        return doGreeting(name);
    }
}
