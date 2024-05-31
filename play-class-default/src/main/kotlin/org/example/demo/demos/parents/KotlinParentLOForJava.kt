package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentLOForJava {
    protected open fun defaultFallback(e: Throwable?): String {
        return ""
    }
}
