package org.example.fs.demos.parents

import org.example.fs.biz.Greeting

open class KotlinParentAllSOForJava {
    fun fallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    open fun fallback(name: String?): String {
        return ""
    }
}
