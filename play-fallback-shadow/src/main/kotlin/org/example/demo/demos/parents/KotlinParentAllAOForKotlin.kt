package org.example.demo.demos.parents

open class KotlinParentAllAOForKotlin {
    open fun fallback(name: String?, e: Throwable?): String {
        return ""
    }

    open fun fallback(name: String?): String {
        return ""
    }
}
