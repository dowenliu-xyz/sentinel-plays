package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFNSHHandlerKotlinDemo : Demo {
    @SentinelResource
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(
        blockHandler = "blockHandler",
        blockHandlerClass = [JavaFNSHHandlerForKotlin::class],
        fallback = "fallback",
        fallbackClass = [JavaFNSHHandlerForKotlin::class]
    )
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
