package org.example.demo.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doFallback
import org.springframework.stereotype.Component

/**
 * case: annotation-base bean; annotation on class; fallback in current class
 * <br></br>
 * aspect DOES NOT take effect, fallback does not take effect.
 */
@Component
@Suppress("unused")
@SentinelResource(fallback = "fallback")
class BasicClassKotlinDemo {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
