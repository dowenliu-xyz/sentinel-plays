package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case: Annotated Abstract Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 * TODO 插件现在没有提示注解无效
 */
public abstract class AAPJavaParentForJava {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    public abstract String greeting(String name);
}
