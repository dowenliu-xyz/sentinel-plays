package org.example.eff.fallback.basic.demos.finalClass;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.basic.biz.Greeting.doFallback;
import static org.example.eff.fallback.basic.biz.Greeting.doGreeting;

@Component
@SentinelResource(value = "demo", fallback = "classFallback") // TODO 仅类注解，AOP 不生效，不应该报错
public final class FinalClassWithClassAnnoWithoutMethodAnnoJavaDemo {
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String classFallback(@Nullable String name, @Nullable Throwable e) {
        return doFallback(name, e);
    }

    @NotNull
    public String classFallback(@Nullable String name) {
        return doFallback(name);
    }
}
