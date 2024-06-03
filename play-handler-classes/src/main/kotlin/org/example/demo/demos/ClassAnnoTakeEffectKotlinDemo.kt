package org.example.demo.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@SentinelResource(
    blockHandlerClass = [BlockHandlerClass::class],
    defaultFallback = "defaultFallback",
    fallbackClass = [FallbackClass::class, FallbackClass2::class] // TODO 没有提示清除多余类
)
@Suppress("unused")
@Component
class ClassAnnoTakeEffectKotlinDemo {
    @SentinelResource
    fun greeting1(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
