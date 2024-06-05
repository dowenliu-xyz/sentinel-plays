package org.example.df.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting.doGreeting

/**
 * case: Annotated Overridden Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect. Because method is overridden.
 */
open class AOPKotlinParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
