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
    @SentinelResource(value = "demo") // TODO 未设置到方法时，visibility 问题没提示
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    // TODO 没有提示 shadow ，方法设置 defaultFallback 后提示
    override fun defaultFallback(e: Throwable?): String {
        return Greeting.doDefaultFallback(e)
    }
}
