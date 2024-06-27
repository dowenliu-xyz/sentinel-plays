package org.example.eff.fallback.basic.demos.finalClass

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
@SentinelResource(value = "demo", fallback = "classFallback") // TODO 仅类注解，AOP 不生效，不应该报错
final class FinalClassWithClassAnnoWithoutMethodAnnoKotlinDemo {
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun classFallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }
}
