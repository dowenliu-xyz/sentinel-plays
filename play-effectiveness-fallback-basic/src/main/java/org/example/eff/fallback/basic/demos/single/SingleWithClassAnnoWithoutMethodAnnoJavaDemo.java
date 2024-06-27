package org.example.eff.fallback.basic.demos.single;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.basic.biz.Greeting.doFallback;
import static org.example.eff.fallback.basic.biz.Greeting.doGreeting;

@Component
@SentinelResource(value = "demo", fallback = "classFallback")
public class SingleWithClassAnnoWithoutMethodAnnoJavaDemo {
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @SuppressWarnings("unused")
    @NotNull
    public String classFallback(@Nullable String name, @Nullable Throwable e) {
        return doFallback(name, e);
    }
}
