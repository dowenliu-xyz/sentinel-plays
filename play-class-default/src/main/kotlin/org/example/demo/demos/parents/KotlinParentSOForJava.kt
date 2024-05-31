package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentSOForJava {
    protected open fun defaultFallback(): String {
        return ""
    }
}
