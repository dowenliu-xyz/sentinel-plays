package org.example.fs.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.fs.biz.Greeting
import org.springframework.stereotype.Component

@Component
class JavaParentLongOKotlinDemo : JavaParentLongOForKotlin() {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun fallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    fun fallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
