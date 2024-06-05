package org.example.basic.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.basic.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
open class AUPKotlinParentForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback")
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
