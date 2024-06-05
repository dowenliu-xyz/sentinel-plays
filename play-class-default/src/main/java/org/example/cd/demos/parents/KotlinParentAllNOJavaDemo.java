package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, no defaultFallback method overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class KotlinParentAllNOJavaDemo extends KotlinParentAllNOForJava {
    @SentinelResource(value = "demo") // TODO 未设置到方法时，visibility 问题没提示
    public String greeting(String name) {
        return doGreeting(name);
    }
}
