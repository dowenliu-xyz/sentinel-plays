package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class OFCSCHFPSPKotlinParentKotlinDemo : OFCSCHFPSPKotlinParentForKotlin(), Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
