package org.example.eff.df.basic.demos.single;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.basic.biz.AnnoType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Greeting.doDefaultFallback;
import static org.example.eff.df.basic.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback")
public class SingleWithClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String classDefaultFallback(@Nullable Throwable e) {
        return AnnoType.ClassAnno.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    public String classDefaultFallback() {
        return AnnoType.ClassAnno.name() + ":" + doDefaultFallback();
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
