package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, all defaultFallback method overridden
 * <p>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class KotlinParentAllAOJavaDemo2 extends KotlinParentAllAOForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    @NotNull
    @Override
    protected String defaultFallback() {
        return doDefaultFallback();
    }

    @NotNull
    @Override
    protected String defaultFallback(@Nullable Throwable e) {
        return doDefaultFallback(e);
    }
}
