package org.example.eff.fallback.basic.demos.finalClass;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.basic.biz.Greeting.doFallback;
import static org.example.eff.fallback.basic.biz.Greeting.doGreeting;

//@Component // Enable this will cause bootstrap failure.
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "classFallback")
public final class FinalClassWithClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", fallback = "methodFallback")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @SuppressWarnings("unused")
    @NotNull
    public String classFallback(@Nullable String name, @Nullable Throwable e) {
        return "";
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
