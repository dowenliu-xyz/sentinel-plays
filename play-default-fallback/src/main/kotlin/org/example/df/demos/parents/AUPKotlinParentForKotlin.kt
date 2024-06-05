package org.example.df.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
open class AUPKotlinParentForKotlin {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
