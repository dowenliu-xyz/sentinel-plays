package org.example.eff.df.basic.demos.finalClass;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.basic.biz.AnnoType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Greeting.*;

//@Component // Enable this will cause bootstrap failure.
@SuppressWarnings("unused")
public final class FinalClassWithoutClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback")
    @NotNull
    public String greeting(@Nullable String name) {
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
