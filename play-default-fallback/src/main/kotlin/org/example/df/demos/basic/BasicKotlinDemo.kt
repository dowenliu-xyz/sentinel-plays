package org.example.df.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting
import org.example.df.biz.Greeting.doDefaultFallback
import org.springframework.stereotype.Component

/**
 * case: annotation-base bean; annotation on method; fallback in current class
 * <br></br>
 * aspect takes effect, fallback takes effect.
 */
@Component
@Suppress("unused")
class BasicKotlinDemo {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
