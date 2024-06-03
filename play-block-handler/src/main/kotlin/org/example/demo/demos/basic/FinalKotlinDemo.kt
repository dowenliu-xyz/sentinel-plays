package org.example.demo.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import lombok.extern.slf4j.Slf4j
import org.example.demo.biz.Greeting.doBlockHandle
import org.example.demo.biz.Greeting.doGreeting
import org.slf4j.LoggerFactory

/**
 * case: annotation-base bean (final class); annotation on method; fallback in current class
 * <br/>
 * Application bootstrap failed.
 * TODO 现在插件未提示会导致启动失败
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
