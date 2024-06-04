package org.example.cd.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@SentinelResource(defaultFallback = "defaultFallback")
public interface JavaAnnotatedInterfaceForJava {
}
