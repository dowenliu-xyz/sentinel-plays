package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.basic.biz.Greeting;

/**
 * case: Annotated Overridden Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect. Because method is overridden.
 */
public class AOPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
