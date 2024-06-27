package org.example.eff.fallback.basic.demos.protectedMethod;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.basic.biz.Greeting.doFallback;
import static org.example.eff.fallback.basic.biz.Greeting.doGreeting;

@Component
@SentinelResource(value = "demo", fallback = "classFallback")
public class ProtectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo {
    private ProtectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo self;

    @Autowired
    public void setSelf(ProtectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo self) {
        this.self = self;
    }

    @NotNull
    protected String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String exportGreeting(@Nullable String name) {
        return self.greeting(name);
    }

    @NotNull
    public String classFallback(@Nullable String name, @Nullable Throwable e) {
        return doFallback(name, e);
    }

    @NotNull
    public String classFallback(@Nullable String name) {
        return doFallback(name);
    }
}
