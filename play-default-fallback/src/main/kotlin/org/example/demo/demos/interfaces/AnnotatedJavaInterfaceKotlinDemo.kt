package org.example.demo.demos.interfaces

import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doDefaultFallback
import org.springframework.stereotype.Component

/**
 * case impl: annotation in interface
 * <br></br>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
@Component
class AnnotatedJavaInterfaceKotlinDemo : AnnotatedJavaInterfaceForKotlin {
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun defaultFallback(e: Throwable?): String {
        return doDefaultFallback(e)
    }
}
