package org.example.demo.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doDefaultFallback
import org.springframework.stereotype.Component

/**
 * case: annotation-base bean; annotation on class; fallback in current class
 * <br></br>
 * aspect DOES NOT take effect, fallback does not take effect.
 */
@Component
@Suppress("unused")
@SentinelResource(defaultFallback = "defaultFallback")
class BasicClassKotlinDemo {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
