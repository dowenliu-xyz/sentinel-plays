package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case: parent annotated and child also annotated
 */
// TODO 所有 bean 子类都有自己的类注解，没有提示类注解失效
@SentinelResource(defaultFallback = "defaultFallbackParent")
open class KotlinParentCAForKotlin {
    protected fun defaultFallbackParent(): String {
        return ""
    }

    protected fun defaultFallbackParent(e: Throwable?): String {
        return ""
    }
}
