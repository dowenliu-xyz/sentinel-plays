package org.example.df.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case interface: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
interface AnnotatedKotlinInterfaceForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    fun greeting(name: String?): String?
}
