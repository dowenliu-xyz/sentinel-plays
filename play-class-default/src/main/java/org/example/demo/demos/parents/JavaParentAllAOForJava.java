package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentAllAOForJava {
    protected String defaultFallback() {
        return "";
    }

    protected String defaultFallback(Throwable e) {
        return "";
    }
}
