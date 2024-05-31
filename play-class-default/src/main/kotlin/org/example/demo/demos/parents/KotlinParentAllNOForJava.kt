package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting

@SentinelResource(defaultFallback = "defaultFallback")
// TODO 子类方法设置 defaultFallback 后，shadow 提示消失
open class KotlinParentAllNOForJava {
    private fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }

    private fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
