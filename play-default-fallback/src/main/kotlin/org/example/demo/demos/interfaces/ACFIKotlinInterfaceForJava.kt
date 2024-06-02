package org.example.demo.demos.interfaces

import org.example.demo.biz.Greeting.doDefaultFallback

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
// with compiler option: -Xjvm-default=all
interface ACFIKotlinInterfaceForJava {
    fun greeting(name: String?): String

    fun defaultFallback(e: Throwable?): String {
        return doDefaultFallback(e)
    }
}
