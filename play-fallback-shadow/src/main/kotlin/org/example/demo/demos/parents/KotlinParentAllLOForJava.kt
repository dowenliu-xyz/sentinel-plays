package org.example.demo.demos.parents

import org.example.demo.biz.Greeting

open class KotlinParentAllLOForJava {
    open fun fallback(name: String?, e: Throwable?): String {
        return ""
    }

    fun fallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
