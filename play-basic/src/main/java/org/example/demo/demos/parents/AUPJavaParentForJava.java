package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
@SuppressWarnings("DataFlowIssue")
public class AUPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 这里没有解析到来自子类的 fallback
    public String greeting(String name) {
        return doGreeting(name);
    }
}
