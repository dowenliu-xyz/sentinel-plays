package org.example.demo.demos.handler.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import lombok.extern.slf4j.Slf4j
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doBlockHandle
import org.springframework.stereotype.Component

@Component
@Slf4j
class SelfHandlersKotlinDemo {
    companion object {
        @JvmStatic
        private fun blockHandler(name: String, e: BlockException): String {
            return doBlockHandle(name, e)
        }
    }

    @SentinelResource(value = "demo", blockHandler = "blockHandler", blockHandlerClass = [SelfHandlersKotlinDemo::class])
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
