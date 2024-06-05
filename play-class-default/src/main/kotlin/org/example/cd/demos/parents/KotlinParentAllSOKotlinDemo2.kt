package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, defaultFallback method without throwable parameter overridden
 * <br></br>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
class KotlinParentAllSOKotlinDemo2 : KotlinParentAllSOForKotlin() {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    // TODO 应该在 override 方法上提示 shadow
    override fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }
}
