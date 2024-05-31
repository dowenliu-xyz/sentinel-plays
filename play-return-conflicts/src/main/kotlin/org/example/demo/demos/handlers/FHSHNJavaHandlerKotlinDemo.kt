package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

// TODO 没有提示冲突
@Component
class FHSHNJavaHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = [FHSHNJavaHandlerForKotlin::class]) // TODO 没有提示修改 visibility
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(fallback = "fallback", fallbackClass = [FHSHNJavaHandlerForKotlin::class]) // TODO 没有提示找不到方法
    override fun second(): Int {
        return Biz.doSecond()
    }
}
