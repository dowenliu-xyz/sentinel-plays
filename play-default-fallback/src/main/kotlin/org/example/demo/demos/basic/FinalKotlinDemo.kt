package org.example.demo.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import lombok.extern.slf4j.Slf4j
import org.example.demo.biz.Greeting.doDefaultFallback
import org.example.demo.biz.Greeting.doGreeting
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

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

    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }

    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
