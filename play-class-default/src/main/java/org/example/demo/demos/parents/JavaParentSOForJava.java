package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentSOForJava {
    protected String defaultFallback() {
        return "";
    }
}
