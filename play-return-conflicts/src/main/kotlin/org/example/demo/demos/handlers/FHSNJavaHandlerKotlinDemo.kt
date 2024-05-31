package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

@Component
class FHSNJavaHandlerKotlinDemo : Demo {
    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [FHSNJavaHandlerForKotlin::class]
    ) // TODO 没有提示修改 visibility
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource
    override fun second(): Int {
        return Biz.doSecond()
    }
}
