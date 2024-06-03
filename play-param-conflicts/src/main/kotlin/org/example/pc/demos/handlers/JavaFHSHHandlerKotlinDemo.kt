package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz.doConsumeInteger
import org.example.pc.biz.Biz.doConsumeString
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFHSHHandlerKotlinDemo : Demo {
    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFHSHHandlerForKotlin::class]
    ) // TODO 重命名 quickfix 没有改本地引用值
    override fun consumeString(str: String?) {
        doConsumeString(str)
    }

    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFHSHHandlerForKotlin::class]
    ) // TODO 重命名 quickfix 没有改本地引用值
    override fun consumeInteger(integer: Int?) {
        doConsumeInteger(integer)
    }
}
