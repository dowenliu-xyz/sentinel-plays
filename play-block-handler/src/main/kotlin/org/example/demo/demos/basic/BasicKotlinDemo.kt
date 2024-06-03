package org.example.demo.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doBlockHandle
import org.springframework.stereotype.Component

/**
 * case: annotation-base bean; annotation on method; fallback in current class
 * <br></br>
 * aspect takes effect, fallback takes effect.
 */
@Component
@Suppress("unused")
class BasicKotlinDemo {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun blockHandler(name: String, e: BlockException): String {
        return doBlockHandle(name, e)
    }
}
