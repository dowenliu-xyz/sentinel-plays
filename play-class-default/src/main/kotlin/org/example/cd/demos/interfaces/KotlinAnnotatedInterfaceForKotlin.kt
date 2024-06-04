package org.example.cd.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource

@SentinelResource(defaultFallback = "defaultFallback")
interface KotlinAnnotatedInterfaceForKotlin
