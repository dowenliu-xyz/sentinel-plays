package org.example.basic.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case: Annotated Abstract Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 * TODO 插件现在没有提示注解无效
 */
abstract class AAPKotlinParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    abstract fun greeting(name: String?): String
}
