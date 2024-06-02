package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case: parent annotated and child also annotated
 */
// TODO 所有 bean 子类都有自己的类注解，没有提示类注解失效
@SentinelResource(defaultFallback = "defaultFallbackParent")
public class JavaParentCAForKotlin {
    protected String defaultFallbackParent() {
        return "";
    }

    // TODO 没有作为任何方法的 defaultFallback ，结果也提示 shadow 了
    protected String defaultFallbackParent(Throwable e) {
        return "";
    }
}
