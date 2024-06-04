package org.example.basic.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.basic.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent (final method)
 * <br></br>
 * Aspect DOES NOT take effect, fallback does not take effect.
 */
open class AUFPKotlinParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 提示注解无效，还检查了 fallback
    fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
