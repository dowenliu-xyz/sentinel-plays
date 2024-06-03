package org.example.basic.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.basic.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br></br>
 * Aspect DOES NOT take effect, fallback does not take effect.
 * TODO 现在插件没有提示失效
 */
open class AUFPKotlinParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }
}