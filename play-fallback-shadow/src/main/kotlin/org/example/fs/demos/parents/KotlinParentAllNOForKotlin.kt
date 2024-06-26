package org.example.fs.demos.parents

import org.example.fs.biz.Greeting

open class KotlinParentAllNOForKotlin {
    fun fallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    fun fallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
