package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentLOForJava {
    protected String defaultFallback(Throwable e) {
        return "";
    }
}
