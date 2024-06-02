package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFNSHHandlerKotlinDemo : Demo {
    @SentinelResource
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFNSHHandlerForKotlin::class]
    )
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
