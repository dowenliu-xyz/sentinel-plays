package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting.doDefaultFallback

@SentinelResource(defaultFallback = "defaultFallback")
open class KotlinParentLNForJava {
    // TODO 没有提示 shadow，不论子类方法是否设置 defaultFallback
    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
