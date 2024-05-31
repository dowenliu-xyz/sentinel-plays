package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, no defaultFallback method overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class KotlinParentAllNOJavaDemo extends KotlinParentAllNOForJava {
    @SentinelResource(value = "demo") // TODO 设置 defaultFallback 后提示修改 visibility 只要修改一个之后，另一个就不提示了
    public String greeting(String name) {
        return doGreeting(name);
    }
}
