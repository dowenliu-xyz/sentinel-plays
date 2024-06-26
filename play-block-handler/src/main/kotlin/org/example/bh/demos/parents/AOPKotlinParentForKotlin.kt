package org.example.bh.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.bh.biz.Greeting.doGreeting

/**
 * case: Annotated Overridden Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect. Because method is overridden.
 */
open class AOPKotlinParentForKotlin {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
