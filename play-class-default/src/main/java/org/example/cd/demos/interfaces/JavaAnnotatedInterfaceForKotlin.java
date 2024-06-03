package org.example.cd.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

// TODO 没有提示接口上注解无效
@SentinelResource(defaultFallback = "defaultFallback")
public interface JavaAnnotatedInterfaceForKotlin {
}
