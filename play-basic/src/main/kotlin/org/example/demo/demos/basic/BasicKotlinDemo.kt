package org.example.demo.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doFallback
import org.springframework.stereotype.Component

/**
 * case: annotation-base bean; annotation on method; fallback in current class
 * <br></br>
 * aspect takes effect, fallback takes effect.
 */
@Component
@Suppress("unused")
class BasicKotlinDemo {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
