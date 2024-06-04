package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.bh.biz.Greeting.doGreeting;

/**
 * case: Annotated Overridden Parent
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect. Because method is overridden.
 */
public class AOPJavaParentForKotlin {
    @SentinelResource(value = "demo", blockHandler = "blockHandler") // TODO 提示注解无效，还检查了 blockHandler
    public String greeting(String name) {
        return doGreeting(name);
    }
}
