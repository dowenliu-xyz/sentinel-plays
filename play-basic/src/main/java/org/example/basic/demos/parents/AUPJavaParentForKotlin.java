package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.basic.biz.Greeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
public class AUPJavaParentForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
