package org.example.df.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br></br>
 * Aspect DOES NOT take effect, fallback does not take effect.
 */
open class AUFPKotlinParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
