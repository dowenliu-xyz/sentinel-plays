package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
open class AUPKotlinParentForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 这里没有解析到来自子类的 fallback
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
