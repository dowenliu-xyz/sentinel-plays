package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.cd.biz.Greeting.doDefaultFallback;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentAllNOForKotlin {
    private String defaultFallback() {
        return doDefaultFallback();
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
