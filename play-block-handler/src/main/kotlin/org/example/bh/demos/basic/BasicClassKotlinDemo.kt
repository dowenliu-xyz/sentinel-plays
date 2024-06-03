package org.example.bh.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting
import org.example.bh.biz.Greeting.doBlockHandle
import org.springframework.stereotype.Component

/**
 * case: annotation-base bean; annotation on class; fallback in current class
 * <br></br>
 * aspect DOES NOT take effect, fallback does not take effect.
 */
@Component
@Suppress("unused")
@SentinelResource(blockHandler = "blockHandler")
class BasicClassKotlinDemo {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun blockHandler(name: String, e: BlockException): String {
        return doBlockHandle(name, e)
    }
}
