package org.example.demo.demos.parents

import org.example.demo.biz.Greeting

open class KotlinParentShortNOForJava {
    fun fallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
