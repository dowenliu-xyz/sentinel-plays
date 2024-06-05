package org.example.basic.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case interface: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
public interface AnnotatedJavaInterfaceForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback")
    String greeting(String name);
}
