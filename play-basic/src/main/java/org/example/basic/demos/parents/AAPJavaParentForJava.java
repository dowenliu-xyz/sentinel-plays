package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case: Annotated Abstract Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
public abstract class AAPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    public abstract String greeting(String name);
}
