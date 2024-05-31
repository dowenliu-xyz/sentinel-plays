package org.example.demo.demos.interfaces

import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doFallback
import org.springframework.stereotype.Component

/**
 * case impl: annotation in interface
 * <br></br>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
@Component
class AnnotatedKotlinInterfaceKotlinDemo : AnnotatedKotlinInterfaceForKotlin {
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun fallback(name: String?, e: Throwable?): String {
        return doFallback(name, e)
    }
}
