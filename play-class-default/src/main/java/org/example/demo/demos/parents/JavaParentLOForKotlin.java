package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentLOForKotlin {
    protected String defaultFallback(Throwable e) {
        return "";
    }
}
