package org.example.basic.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case interface: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
interface AnnotatedKotlinInterfaceForJava {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 提示注解无效，还检查了 fallback
    fun greeting(name: String?): String?
}
