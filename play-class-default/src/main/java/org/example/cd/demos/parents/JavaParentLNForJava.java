package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.cd.biz.Greeting.doDefaultFallback;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentLNForJava {
    // TODO 没有提示 shadow，不论子类方法是否设置 defaultFallback
    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}