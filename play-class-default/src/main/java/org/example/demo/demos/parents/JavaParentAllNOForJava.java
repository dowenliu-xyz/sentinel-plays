package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.demo.biz.Greeting.doDefaultFallback;

@SentinelResource(defaultFallback = "defaultFallback")
// TODO 子类方法设置 defaultFallback 后，shadow 提示消失
public class JavaParentAllNOForJava {
    private String defaultFallback() {
        return doDefaultFallback();
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
