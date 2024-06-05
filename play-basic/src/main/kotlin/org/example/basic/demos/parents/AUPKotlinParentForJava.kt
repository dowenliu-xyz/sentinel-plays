package org.example.basic.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.basic.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
open class AUPKotlinParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback")  // TODO 自动完成有问题，好像是 IDE bug
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
