package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentSOForKotlin {
    protected String defaultFallback() {
        return "";
    }
}
