package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, defaultFallback method with throwable parameter overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class KotlinParentAllLOJavaDemo extends KotlinParentAllLOForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    // TODO 没有提示 shadow ，方法设置 defaultFallback 后提示
    @NotNull
    @Override
    protected String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
