package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

@Component
class FSSHJavaHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun first(): String {
        return Biz.doFirst()
    }

    private fun fallback(): String {
        return Biz.doFirstFallback()
    }

    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [FSSHJavaHandlerForKotlin::class]
    ) // TODO 没有提示修改 visibility
    override fun second(): Int {
        return Biz.doSecond()
    }
}
