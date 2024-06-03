package org.example.fs.demos.parents

import org.example.fs.biz.Greeting

open class KotlinParentShortNOForJava {
    fun fallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
