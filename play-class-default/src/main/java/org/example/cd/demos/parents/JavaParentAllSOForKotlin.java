package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.cd.biz.Greeting.doDefaultFallback;

@SentinelResource(defaultFallback = "defaultFallback")
public class JavaParentAllSOForKotlin {
    protected String defaultFallback() {
        return "";
    }

    // TODO shadow 目标识别错误，应该是子类重写方法
    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
