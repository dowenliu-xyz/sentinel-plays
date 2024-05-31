package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.example.demo.demos.handlers.KotlinFNSHHandlerForJava
import org.springframework.stereotype.Component

@Component
class KotlinFNSHHandlerKotlinDemo : Demo {
    @SentinelResource
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(fallback = "fallback", fallbackClass = [KotlinFNSHHandlerForKotlin::class])
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
