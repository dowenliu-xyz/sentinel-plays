package org.example.demo.demos.parents

import org.example.demo.biz.Greeting.doDefaultFallback

/**
 * case: Annotation in Child and Fallback in Parent
 */
@Suppress("unused")
open class ACFPKotlinParentForJava {
    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
