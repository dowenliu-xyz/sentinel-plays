package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz

open class OFPSCHFCSCKotlinParentForJava {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    open fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }
}
