package org.example.demo.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

/**
 * case impl: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but CAN NOT find fallback method.
 */
@Component
class ACFIJavaInterfaceKotlinDemo : ACFIJavaInterfaceForKotlin {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    override fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
