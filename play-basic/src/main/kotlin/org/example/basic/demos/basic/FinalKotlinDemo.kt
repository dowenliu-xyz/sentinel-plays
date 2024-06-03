package org.example.basic.demos.basic

import com.alibaba.csp.sentinel.annotation.SentinelResource
import lombok.extern.slf4j.Slf4j
import org.example.basic.biz.Greeting.doFallback
import org.example.basic.biz.Greeting.doGreeting
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

    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }

    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
