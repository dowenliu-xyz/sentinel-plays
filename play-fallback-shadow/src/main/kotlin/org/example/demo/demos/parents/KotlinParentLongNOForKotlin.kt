package org.example.demo.demos.parents

import org.example.demo.biz.Greeting

open class KotlinParentLongNOForKotlin {
    fun fallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }
}
