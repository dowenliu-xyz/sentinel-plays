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
@SentinelResource(value = "demo", defaultFallback = "classDefaultFallback")
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
    public String classDefaultFallback(@Nullable Throwable e) {
        return AnnoType.ClassAnno.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    public String classDefaultFallback() {
        return AnnoType.ClassAnno.name() + ":" + doDefaultFallback();
    }
}
