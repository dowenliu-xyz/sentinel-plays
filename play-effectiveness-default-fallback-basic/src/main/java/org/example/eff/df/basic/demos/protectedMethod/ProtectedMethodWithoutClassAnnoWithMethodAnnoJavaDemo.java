package org.example.eff.df.basic.demos.protectedMethod;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.basic.biz.AnnoType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Greeting.doDefaultFallback;
import static org.example.eff.df.basic.biz.Greeting.doGreeting;

@Component
public class ProtectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo {
    private ProtectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo self;

    @Autowired
    public void setSelf(ProtectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo self) {
        this.self = self;
    }

    @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback")
    @NotNull
    protected String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String exportGreeting(@Nullable String name) {
        return self.greeting(name);
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
