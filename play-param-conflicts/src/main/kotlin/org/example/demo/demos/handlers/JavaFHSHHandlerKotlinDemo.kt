package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz.doConsumeInteger
import org.example.demo.biz.Biz.doConsumeString
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFHSHHandlerKotlinDemo : Demo {
    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFHSHHandlerForKotlin::class]
    ) // TODO 没有提示修改 visibility
    override fun consumeString(str: String?) {
        doConsumeString(str)
    }

    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFHSHHandlerForKotlin::class]
    ) // TODO 没有提示修改 visibility
    override fun consumeInteger(integer: Int?) {
        doConsumeInteger(integer)
    }
}
