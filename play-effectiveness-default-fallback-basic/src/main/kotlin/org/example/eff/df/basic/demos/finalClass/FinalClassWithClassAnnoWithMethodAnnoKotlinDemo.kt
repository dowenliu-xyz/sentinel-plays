package org.example.eff.df.basic.demos.finalClass

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.basic.biz.AnnoType
import org.example.eff.df.basic.biz.Greeting
import org.springframework.stereotype.Component

//@Component // Enable this will cause bootstrap failure.
@Suppress("unused")
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback")
final class FinalClassWithClassAnnoWithMethodAnnoKotlinDemo {
    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun classDefaultFallback(e: Throwable?): String {
        return AnnoType.ClassAnno.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun classDefaultFallback(): String {
        return AnnoType.ClassAnno.name + ":" + Greeting.doDefaultFallback()
    }

    fun methodDefaultFallback(e: Throwable?): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun methodDefaultFallback(): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback()
    }
}
