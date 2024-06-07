package org.example.cd.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@SentinelResource(defaultFallback = "defaultFallback")
// This is an interface a Bean class implemented.
public interface JavaAnnotatedInterfaceForJava {
}
