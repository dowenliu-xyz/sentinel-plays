package org.example.eff.fallback.basic.demos.finalClass;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.basic.biz.Greeting.doFallback;
import static org.example.eff.fallback.basic.biz.Greeting.doGreeting;

//@Component // Enable this will cause bootstrap failure.
@SuppressWarnings("unused")
public final class FinalClassWithoutClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", fallback = "methodFallback")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String methodFallback(@Nullable String name, @Nullable Throwable e) {
        return doFallback(name, e);
    }

    @NotNull
    public String methodFallback(@Nullable String name) {
        return doFallback(name);
    }
}
