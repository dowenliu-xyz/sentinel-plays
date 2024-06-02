package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case: parent annotated and child also annotated
 */
// TODO 所有 bean 子类都有自己的类注解，没有提示类注解失效
@SentinelResource(defaultFallback = "defaultFallbackParent")
open class KotlinParentCAForJava {
    protected fun defaultFallbackParent(): String {
        return ""
    }

    // TODO 没有作为任何方法的 defaultFallback ，结果也提示 shadow 了
    protected fun defaultFallbackParent(e: Throwable?): String {
        return ""
    }
}
