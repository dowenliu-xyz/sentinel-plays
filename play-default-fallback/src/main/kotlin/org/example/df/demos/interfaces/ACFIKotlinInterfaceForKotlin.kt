package org.example.df.demos.interfaces

import org.example.df.biz.Greeting.doDefaultFallback

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
// with compiler option: -Xjvm-default=all
interface ACFIKotlinInterfaceForKotlin {
    fun greeting(name: String?): String

    fun defaultFallback(e: Throwable?): String {
        return doDefaultFallback(e)
    }
}
