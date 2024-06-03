package org.example.demo.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * case interface: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 * TODO 插件现在没有提示注解无效
 */
interface AnnotatedKotlinInterfaceForJava {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    fun greeting(name: String?): String?
}
