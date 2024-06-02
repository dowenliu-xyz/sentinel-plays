package org.example.demo.demos.handler.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import lombok.extern.slf4j.Slf4j
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doDefaultFallback
import org.springframework.stereotype.Component

@Component
@Slf4j
class SelfHandlersKotlinDemo {
    companion object {
        @JvmStatic
        private fun defaultFallback(e: Throwable): String {
            return doDefaultFallback(e)
        }
    }

    @SentinelResource(value = "demo", defaultFallback = "defaultFallback", fallbackClass = [SelfHandlersKotlinDemo::class])
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
