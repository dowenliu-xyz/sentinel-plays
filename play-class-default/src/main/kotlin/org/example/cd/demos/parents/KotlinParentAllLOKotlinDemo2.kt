package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, defaultFallback method with throwable parameter overridden
 * <br></br>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
class KotlinParentAllLOKotlinDemo2 : KotlinParentAllLOForKotlin() {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun defaultFallback(e: Throwable?): String {
        return Greeting.doDefaultFallback(e)
    }
}
