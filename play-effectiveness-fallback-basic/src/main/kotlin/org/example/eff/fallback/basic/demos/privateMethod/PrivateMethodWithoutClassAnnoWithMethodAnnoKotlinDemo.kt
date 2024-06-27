package org.example.eff.fallback.basic.demos.privateMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PrivateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo {
    private var self: PrivateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: PrivateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo?) {
        this.self = self
    }

    @SentinelResource(value = "demo", fallback = "methodFallback") // TODO private 方法的注解应该提示无效
    private fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
    }

    fun methodFallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    fun methodFallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
