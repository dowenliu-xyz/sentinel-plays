package org.example.bh.demos.interfaces;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case interface: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
public interface AnnotatedJavaInterfaceForKotlin {
    @SentinelResource(value = "demo", blockHandler = "blockHandler") // TODO 提示注解无效，还检查了 blockHandler
    String greeting(String name);
}
