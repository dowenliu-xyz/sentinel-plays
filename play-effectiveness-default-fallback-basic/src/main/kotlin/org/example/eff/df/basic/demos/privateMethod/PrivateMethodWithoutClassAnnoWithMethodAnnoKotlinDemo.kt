package org.example.eff.df.basic.demos.privateMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.basic.biz.AnnoType
import org.example.eff.df.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PrivateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo {
    private var self: PrivateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: PrivateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo?) {
        this.self = self
    }

    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback") // TODO private 方法的注解应该提示无效
    private fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
    }

    fun methodDefaultFallback(e: Throwable?): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun methodDefaultFallback(): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback()
    }
}
