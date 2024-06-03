package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, no defaultFallback method overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class JavaParentAllNOJavaDemo extends JavaParentAllNOForJava {
    @SentinelResource(value = "demo") // TODO 设置到方法上，修改一个方法的 visibility 后，另一个方法不提示修改 visibility 了
    public String greeting(String name) {
        return doGreeting(name);
    }
}
