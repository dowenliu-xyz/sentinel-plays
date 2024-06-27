package org.example.eff.df.basic.demos.single;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.basic.biz.AnnoType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Greeting.doDefaultFallback;
import static org.example.eff.df.basic.biz.Greeting.doGreeting;

@Component
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback")
public class SingleWithClassAnnoWithoutMethodAnnoJavaDemo {
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @SuppressWarnings("unused")
    @NotNull
    public String classDefaultFallback(@Nullable Throwable e) {
        return AnnoType.ClassAnno.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    public String classDefaultFallback() {
        return AnnoType.ClassAnno.name() + ":" + doDefaultFallback();
    }
}
