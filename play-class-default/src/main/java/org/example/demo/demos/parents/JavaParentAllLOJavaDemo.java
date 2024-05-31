package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doDefaultFallback;
import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, defaultFallback method with throwable parameter overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class JavaParentAllLOJavaDemo extends JavaParentAllLOForJava {
    @SentinelResource(value = "demo") // TODO 设置 defaultFallback 后没有提示修改 visibility
    public String greeting(String name) {
        return doGreeting(name);
    }

    // TODO 没有提示 shadow ，不论方法是否设置 defaultFallback
    @Override
    protected String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
