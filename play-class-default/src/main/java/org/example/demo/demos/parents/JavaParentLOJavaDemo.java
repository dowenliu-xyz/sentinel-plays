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
public class JavaParentLOJavaDemo extends JavaParentLOForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback() {
        return doDefaultFallback();
    }

    // TODO 没有提示 shadow，设置方法 defaultFallback 后有提示
    @Override
    protected String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
