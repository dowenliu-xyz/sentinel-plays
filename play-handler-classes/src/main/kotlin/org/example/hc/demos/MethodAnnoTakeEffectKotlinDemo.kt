package org.example.hc.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.hc.biz.Greeting
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class MethodAnnoTakeEffectKotlinDemo {
    @SentinelResource(blockHandlerClass = [BlockHandlerClass::class], fallbackClass = [FallbackClass::class])
    fun greeting1(name: String?): String {
        return Greeting.doGreeting(name)
    }

    @SentinelResource(blockHandlerClass = [BlockHandlerClass::class], fallbackClass = [FallbackClass::class])
    fun greeting2(name: String?): String {
        return Greeting.doGreeting(name)
    }

    @SentinelResource(
        blockHandlerClass = [BlockHandlerClass::class, BlockHandlerClass2::class],
        fallbackClass = [FallbackClass::class, FallbackClass2::class]
    )
    fun greeting3(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
