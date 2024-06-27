package org.example.eff.df.basic.demos.single

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.basic.biz.AnnoType
import org.example.eff.df.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
class SingleWithoutClassAnnoWithMethodAnnoKotlinDemo {
    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun methodDefaultFallback(e: Throwable?): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun methodDefaultFallback(): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback()
    }
}
