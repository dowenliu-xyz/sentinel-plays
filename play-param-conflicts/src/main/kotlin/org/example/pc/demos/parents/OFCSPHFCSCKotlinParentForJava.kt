package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz

open class OFCSPHFCSCKotlinParentForJava {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    open fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
