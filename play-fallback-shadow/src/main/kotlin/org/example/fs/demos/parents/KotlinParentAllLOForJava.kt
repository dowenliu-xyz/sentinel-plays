package org.example.fs.demos.parents

import org.example.fs.biz.Greeting

open class KotlinParentAllLOForJava {
    open fun fallback(name: String?, e: Throwable?): String {
        return ""
    }

    fun fallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
