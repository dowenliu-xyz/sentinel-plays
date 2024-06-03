package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.cd.biz.Greeting.doDefaultFallback;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentAllLOForJava {
    private String defaultFallback() {
        return doDefaultFallback();
    }

    // TODO 被重写方法不需要提示 shadow
    protected String defaultFallback(Throwable e) {
        return "";
    }
}
