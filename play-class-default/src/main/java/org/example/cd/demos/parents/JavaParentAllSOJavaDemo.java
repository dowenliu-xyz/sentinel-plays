package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, defaultFallback method without throwable parameter overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class JavaParentAllSOJavaDemo extends JavaParentAllSOForJava {
    @SentinelResource(value = "demo") // TODO 设置 defaultFallback 后没有提示修改 visibility
    public String greeting(String name) {
        return doGreeting(name);
    }

    // TODO 应该在 override 方法上提示 shadow
    @Override
    protected String defaultFallback() {
        return doDefaultFallback();
    }
}