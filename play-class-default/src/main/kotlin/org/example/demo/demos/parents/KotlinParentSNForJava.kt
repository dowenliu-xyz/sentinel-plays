package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentSNForJava {
    private fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }
}
