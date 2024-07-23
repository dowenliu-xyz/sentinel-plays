package org.example.scni

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class KtCase : Case {
    // Overridden method's return type is `Integer`, which is `Int!` in Kotlin.
    // The return type of this method is compiled to `java.lang.Integer`.
    // All it's handlers should also return `java.lang.Integer`.
    // We have to use `Int?` in code to ensure this. Otherwise, a handler would be compiled to return primitive `int`.
    @SentinelResource(value = "kt", fallback = "fallback", blockHandler = "bh", defaultFallback = "df")
    override fun getInt(): Int {
        throw IllegalStateException("biz error")
    }

    private fun fallback(e: Throwable?): Int? {
        return -1
    }
}