package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFHSNHandlerKotlinDemo : Demo {
    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFHSNHandlerForKotlin::class]
    ) // TODO 没有提示修改 visibility
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
