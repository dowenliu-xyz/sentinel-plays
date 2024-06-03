package org.example.hc.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.hc.biz.Greeting

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
