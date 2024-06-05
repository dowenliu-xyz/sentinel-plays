package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting.doDefaultFallback

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentLNForKotlin {
    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
