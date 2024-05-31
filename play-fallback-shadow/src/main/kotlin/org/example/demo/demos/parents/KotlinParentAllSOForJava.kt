package org.example.demo.demos.parents

import org.example.demo.biz.Greeting

open class KotlinParentAllSOForJava {
    fun fallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    open fun fallback(name: String?): String {
        return ""
    }
}
