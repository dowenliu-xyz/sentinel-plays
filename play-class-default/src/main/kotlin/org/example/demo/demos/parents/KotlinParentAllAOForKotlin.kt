package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentAllAOForKotlin {
    protected open fun defaultFallback(): String {
        return ""
    }

    protected open fun defaultFallback(e: Throwable?): String {
        return ""
    }
}
