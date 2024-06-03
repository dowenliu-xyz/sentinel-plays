package org.example.demo.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@SentinelResource(
    blockHandlerClass = [BlockHandlerClass::class, BlockHandlerClass2::class],
    defaultFallback = "defaultFallback",
    fallbackClass = [FallbackClass::class, FallbackClass2::class]
)
@Suppress("unused")
@Component
class ClassAnnoTakeEffectKotlinDemo {
    @SentinelResource
    fun greeting1(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
