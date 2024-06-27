package org.example.eff.fallback.basic.demos.staticMethod;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.basic.biz.Greeting.doFallback;
import static org.example.eff.fallback.basic.biz.Greeting.doGreeting;

@Component
public class StaticMethodWithoutClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", fallback = "methodFallback") // TODO static 方法上注解应该提示不生效
    @NotNull
    public static String greeting(@Nullable String name) {
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
