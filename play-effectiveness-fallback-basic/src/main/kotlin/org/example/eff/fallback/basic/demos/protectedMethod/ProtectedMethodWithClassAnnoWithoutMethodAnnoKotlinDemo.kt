package org.example.eff.fallback.basic.demos.protectedMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", fallback = "classFallback")
class ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo {
    private var self: ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo?) {
        this.self = self
    }

    protected fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
    }

    fun classFallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }
}
