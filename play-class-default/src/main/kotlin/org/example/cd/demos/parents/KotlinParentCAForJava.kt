package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case: parent annotated and child also annotated
 */
@SentinelResource(defaultFallback = "defaultFallbackParent")
open class KotlinParentCAForJava {
    protected fun defaultFallbackParent(): String {
        return ""
    }

    protected fun defaultFallbackParent(e: Throwable?): String {
        return ""
    }
}
