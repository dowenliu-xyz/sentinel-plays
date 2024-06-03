package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentAllAOForJava {
    protected open fun defaultFallback(): String {
        return ""
    }

    protected open fun defaultFallback(e: Throwable?): String {
        return ""
    }
}
