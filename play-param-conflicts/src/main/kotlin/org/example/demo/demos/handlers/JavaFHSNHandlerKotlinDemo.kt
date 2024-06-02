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
    )
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
