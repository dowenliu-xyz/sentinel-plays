package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz.doConsumeInteger
import org.example.pc.biz.Biz.doConsumeString
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFHSHHandlerKotlinDemo : Demo {
    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [JavaFHSHHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [JavaFHSHHandlerForKotlin::class]
    )
    override fun consumeString(str: String?) {
        doConsumeString(str)
    }

    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [JavaFHSHHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [JavaFHSHHandlerForKotlin::class]
    )
    override fun consumeInteger(integer: Int?) {
        doConsumeInteger(integer)
    }
}
