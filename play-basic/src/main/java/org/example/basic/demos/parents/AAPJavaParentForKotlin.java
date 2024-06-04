package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case: Annotated Abstract Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
public abstract class AAPJavaParentForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 提示注解无效，还检查了 fallback
    public abstract String greeting(String name);
}
