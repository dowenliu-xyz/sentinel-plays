package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentAllLOForKotlin {
    private fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }

    protected open fun defaultFallback(e: Throwable?): String {
        return ""
    }
}
