package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, defaultFallback method with throwable parameter overridden
 *
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
@Primary
class JavaParentAllLOKotlinDemo : JavaParentAllLOForKotlin() {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    // TODO 没有提示 shadow ，方法设置 defaultFallback 后提示
    public override fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
