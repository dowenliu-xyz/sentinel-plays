package org.example.rc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.rc.biz.Biz
import org.example.rc.biz.Demo
import org.springframework.stereotype.Component

@Component
class FHSSJavaHandlerKotlinDemo : Demo {
    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [FHSSJavaHandlerForKotlin::class]
    )
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(fallback = "fallback")
    // 这里会编译成 Integer 类型，是因为 override 接口的方法返回类型是 Integer 类型。
    // 这里写成 Int 类型语法上能通过，是因为 Int 可以赋值给 Int? 类型。Override 的语法允许。
    override fun second(): Int { // TODO 插件应该结合 override 来推断类型
        return Biz.doSecond()
    }

    // 没有其他约束，这里如果写成 Int 类型一定会编译成 int 。
    private fun fallback(): Int? {
        return Biz.doSecondFallback()
    }
}
