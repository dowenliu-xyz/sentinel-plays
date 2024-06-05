package org.example.pc.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Biz.doBlockHandle
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: both first and second fallback provided
 *
 * Conflicts.
 */
@Component
class SelfBothFallbackKotlinDemo : Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    // 这里是 Int? 如果接口是 @NotNull Integer ，那么这里会是 Int ，运行时是 int，不是 Integer ，与 Java 有差异，需要注意
    // 如果是 Int 时，运行时 fallback 要找 fallback(int) ，而不是 fallback(Integer)
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }

    private fun blockHandler(str: String?, e: BlockException) {
        doBlockHandle(str, e)
    }

    private fun blockHandler(integer: Int?, e: BlockException) {
        doBlockHandle(integer, e)
    }

    private fun fallback(str: String?) {
        Biz.doFallback(str)
    }

    private fun fallback(integer: Int?) {
        Biz.doFallback(integer)
    }
}
