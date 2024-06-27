package org.example.eff.df.basic.demos.privateMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.basic.biz.AnnoType
import org.example.eff.df.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback")
class PrivateMethodWithClassAnnoWithoutMethodAnnoKotlinDemo {
    private var self: PrivateMethodWithClassAnnoWithoutMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: PrivateMethodWithClassAnnoWithoutMethodAnnoKotlinDemo?) {
        this.self = self
    }

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
}
