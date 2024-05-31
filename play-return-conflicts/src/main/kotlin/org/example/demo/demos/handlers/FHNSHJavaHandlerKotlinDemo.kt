package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

// TODO 没有提示冲突
@Component
class FHNSHJavaHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = [FHNSHJavaHandlerForKotlin::class])
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [FHNSHJavaHandlerForKotlin::class]
    ) // TODO 没有提示修改 visibility
    override fun second(): Int {
        return Biz.doSecond()
    }
}
