package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: Annotated Overridden Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect. Because method is overridden.
 * TODO 现在插件没有提示注解失效
 */
public class AOPJavaParentForKotlin {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
