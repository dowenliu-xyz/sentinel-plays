package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentLOForKotlin {
    protected open fun defaultFallback(e: Throwable?): String {
        return ""
    }
}
