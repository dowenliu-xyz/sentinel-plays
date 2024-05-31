package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, defaultFallback method with throwable parameter overridden
 *
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
class JavaParentAllLOKotlinDemo : JavaParentAllLOForKotlin() {
    @SentinelResource(value = "demo") // TODO 设置 defaultFallback 后没有提示修改 visibility
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    // TODO 没有提示 shadow ，不论方法是否设置 defaultFallback
    public override fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
