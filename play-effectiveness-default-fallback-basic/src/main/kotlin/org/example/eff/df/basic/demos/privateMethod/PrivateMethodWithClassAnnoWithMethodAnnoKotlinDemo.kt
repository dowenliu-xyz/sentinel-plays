package org.example.eff.df.basic.demos.privateMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.basic.biz.AnnoType
import org.example.eff.df.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback")
class PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo {
    private var self: PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo?) {
        this.self = self
    }

    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback")
    private fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
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
