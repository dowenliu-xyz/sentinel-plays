package org.example.eff.fallback.basic.demos.privateMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", fallback = "classFallback")
class PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo {
    private var self: PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo?) {
        this.self = self
    }

    @SentinelResource(value = "demo", fallback = "methodFallback")
    private fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
    }

    fun classFallback(name: String?, e: Throwable?): String {
        return ""
    }

    fun methodFallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    fun methodFallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
