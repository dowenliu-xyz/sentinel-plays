package org.example.demo.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting

@SentinelResource(
    blockHandlerClass = [BlockHandlerClass::class],
    defaultFallback = "defaultFallback",
    fallbackClass = [FallbackClass::class, FallbackClass2::class]
)
@Suppress("unused")
class ClassAnnoNotTakeEffectKotlinDemo {
    fun greeting1(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
