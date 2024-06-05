package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.cd.biz.Greeting.doDefaultFallback;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentAllSOForJava {
    protected String defaultFallback() {
        return "";
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
