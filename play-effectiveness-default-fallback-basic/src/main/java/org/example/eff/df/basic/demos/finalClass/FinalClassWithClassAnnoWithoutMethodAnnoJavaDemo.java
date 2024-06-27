package org.example.eff.df.basic.demos.finalClass;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.basic.biz.AnnoType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Greeting.*;

@Component
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback") // TODO 仅类注解，AOP 不生效，不应该报错
public final class FinalClassWithClassAnnoWithoutMethodAnnoJavaDemo {
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
}
