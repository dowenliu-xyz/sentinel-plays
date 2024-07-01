package org.example.eff.df.basic.demos.finalClass

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.basic.biz.AnnoType
import org.example.eff.df.basic.biz.Greeting
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback")
final class FinalClassWithClassAnnoWithoutMethodAnnoKotlinDemo {
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun classDefaultFallback(e: Throwable?): String {
        return AnnoType.ClassAnno.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun classDefaultFallback(): String {
        return AnnoType.ClassAnno.name + ":" + Greeting.doDefaultFallback()
    }
}
