package org.example.basic.demos.handler.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import lombok.extern.slf4j.Slf4j
import org.example.basic.biz.Greeting
import org.example.basic.biz.Greeting.doFallback
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
