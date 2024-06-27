package org.example.eff.df.basic.demos.staticMethod;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.basic.biz.AnnoType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Greeting.doDefaultFallback;
import static org.example.eff.df.basic.biz.Greeting.doGreeting;

@Component
public class StaticMethodWithoutClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback") // TODO static 方法上注解应该提示不生效
    @NotNull
    public static String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String methodDefaultFallback(@Nullable Throwable e) {
        return AnnoType.MethodAnno.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    public String methodDefaultFallback() {
        return AnnoType.MethodAnno.name() + ":" + doDefaultFallback();
    }
}