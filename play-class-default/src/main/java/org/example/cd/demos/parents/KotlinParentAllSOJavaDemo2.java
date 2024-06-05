package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, defaultFallback method without throwable parameter overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class KotlinParentAllSOJavaDemo2 extends KotlinParentAllSOForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    @NotNull
    @Override
    protected String defaultFallback() {
        return doDefaultFallback();
    }
}
