package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.example.demo.demos.handlers.KotlinFHSHHandlerForKotlin
import org.springframework.stereotype.Component

// TODO 重命名 quickfix 没有改本地引用值
@Component
class KotlinFHSHHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = [KotlinFHSHHandlerForKotlin::class])
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(fallback = "fallback", fallbackClass = [KotlinFHSHHandlerForKotlin::class])
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
