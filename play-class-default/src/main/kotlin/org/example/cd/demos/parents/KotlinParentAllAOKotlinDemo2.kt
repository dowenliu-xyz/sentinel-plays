package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting.doDefaultFallback
import org.example.cd.biz.Greeting.doGreeting
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, all defaultFallback method overridden
 *
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
@Primary
class KotlinParentAllAOKotlinDemo2 : KotlinParentAllAOForKotlin() {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }

    public override fun defaultFallback(): String {
        return doDefaultFallback()
    }

    public override fun defaultFallback(e: Throwable?): String {
        return doDefaultFallback(e)
    }
}
