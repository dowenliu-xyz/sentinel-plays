package org.example.demo.demos.handler.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import lombok.extern.slf4j.Slf4j
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doFallback
import org.springframework.stereotype.Component

@Component
@Slf4j
class SelfHandlersKotlinDemo {
    companion object {
        @JvmStatic
        private fun fallback(name: String, e: Throwable): String {
            return doFallback(name, e)
        }
    }

    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = [SelfHandlersKotlinDemo::class])
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
