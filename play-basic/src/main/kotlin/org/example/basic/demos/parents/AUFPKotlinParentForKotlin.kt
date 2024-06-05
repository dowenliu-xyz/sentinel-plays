package org.example.basic.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.basic.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br></br>
 * Aspect DOES NOT take effect, fallback does not take effect.
 */
open class AUFPKotlinParentForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
