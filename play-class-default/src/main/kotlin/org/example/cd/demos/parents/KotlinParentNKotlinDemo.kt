package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, no defaultFallback method to override
 * <br></br>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
class KotlinParentNKotlinDemo : KotlinParentNForKotlin() {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }

    // TODO 没有提示 shadow，设置方法 defaultFallback 后有提示
    private fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
