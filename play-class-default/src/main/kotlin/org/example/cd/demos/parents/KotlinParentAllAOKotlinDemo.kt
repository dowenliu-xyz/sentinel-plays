package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting.doDefaultFallback
import org.example.cd.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, all defaultFallback method overridden
 *
 * Aspect takes effect, defaultFallback takes effect.
 * TODO 类注解时没有提示 shadow，但在父类中的提示，但提示 shadow 方法没有指向子类重写方法
 */
@Component
class KotlinParentAllAOKotlinDemo : KotlinParentAllAOForKotlin() {
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
