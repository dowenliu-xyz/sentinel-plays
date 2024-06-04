package org.example.bh.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case: Annotated Abstract Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
abstract class AAPKotlinParentForKotlin {
    @SentinelResource(value = "demo", blockHandler = "blockHandler") // TODO 提示注解无效，还检查了 blockHandler
    abstract fun greeting(name: String?): String
}
