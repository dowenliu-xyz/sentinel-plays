package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentAllSOForJava {
    protected open fun defaultFallback(): String {
        return ""
    }

    // TODO shadow 目标识别错误，应该是子类重写方法
    private fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
