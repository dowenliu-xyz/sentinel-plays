package org.example.df.demos.handler.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import lombok.extern.slf4j.Slf4j
import org.example.df.biz.Greeting
import org.example.df.biz.Greeting.doDefaultFallback
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
