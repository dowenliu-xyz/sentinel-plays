package org.example.basic.demos.interfaces

import org.example.basic.biz.Greeting
import org.example.basic.biz.Greeting.doFallback
import org.springframework.stereotype.Component

/**
 * case impl: annotation in interface
 * <br></br>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
@Component
class AnnotatedJavaInterfaceKotlinDemo :
    AnnotatedJavaInterfaceForKotlin {
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun fallback(name: String?, e: Throwable?): String {
        return doFallback(name, e)
    }
}
