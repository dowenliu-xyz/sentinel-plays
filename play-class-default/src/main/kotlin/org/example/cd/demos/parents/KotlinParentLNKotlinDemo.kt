package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, no defaultFallback method overridden
 * <br></br>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
@Primary
class KotlinParentLNKotlinDemo : KotlinParentLNForKotlin() {
    @SentinelResource(value = "demo") // TODO 未设置到方法时，visibility 问题没提示
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }
}
