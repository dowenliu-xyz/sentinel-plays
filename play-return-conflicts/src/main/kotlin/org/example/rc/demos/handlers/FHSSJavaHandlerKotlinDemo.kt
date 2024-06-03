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
    override fun second(): Int {
        return Biz.doSecond()
    }

    // TODO 这里好像应该给 Sentinel 项目提 bug 。这里运行时返回类型为 int ，而方法 second() 返回值类型为 Integer 。编译时确定不了这个方法返回是基本类型还是包装类型。
    // 可以提一个 PR ，处理 return type assignability 判断问题。
    private fun fallback(): Int? {
        return Biz.doSecondFallback()
    }
}
