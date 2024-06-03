package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.basic.biz.Greeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 成功解析到子类方法，但检查有问题：未找到方法
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
