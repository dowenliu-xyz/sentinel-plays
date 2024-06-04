package org.example.df.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case: Annotated Abstract Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
public abstract class AAPJavaParentForKotlin {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback") // TODO 提示注解无效，还检查了 defaultFallback
    public abstract String greeting(String name);
}
