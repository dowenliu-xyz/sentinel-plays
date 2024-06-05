package org.example.df.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
open class AUPKotlinParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback") // TODO 自动完成有问题，好像是 IDE bug
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
