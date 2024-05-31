package org.example.demo.demos.parents

import org.example.demo.biz.Greeting

open class KotlinParentShortNOForKotlin {
    fun fallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
