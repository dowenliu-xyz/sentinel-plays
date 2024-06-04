package org.example.bh.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import lombok.extern.slf4j.Slf4j
import org.example.bh.biz.Greeting.doBlockHandle
import org.example.bh.biz.Greeting.doGreeting
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

/**
 * case: annotation-base bean (final class); annotation on method; fallback in current class
 * <br/>
 * Application bootstrap failed.
 */
//@Component // Enable this line will cause the application bootstrap failed.
@Suppress("unused")
@Slf4j
final class FinalKotlinDemo {
    companion object {
        private val log = LoggerFactory.getLogger(FinalKotlinDemo::class.java)
    }

    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }

    private fun blockHandler(name: String, e: BlockException): String {
        return doBlockHandle(name, e)
    }
}
