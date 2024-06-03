package org.example.demo.demos.interfaces

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doBlockHandle
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

    fun blockHandler(name: String?, e: BlockException?): String {
        return doBlockHandle(name, e)
    }
}
