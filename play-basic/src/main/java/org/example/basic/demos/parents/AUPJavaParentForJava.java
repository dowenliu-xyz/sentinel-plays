package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.basic.biz.Greeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 自动完成有问题，好像是 IDE bug
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
