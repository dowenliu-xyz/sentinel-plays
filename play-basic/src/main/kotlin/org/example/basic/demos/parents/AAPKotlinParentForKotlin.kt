package org.example.basic.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case: Annotated Abstract Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
abstract class AAPKotlinParentForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback")
    abstract fun greeting(name: String?): String
}
