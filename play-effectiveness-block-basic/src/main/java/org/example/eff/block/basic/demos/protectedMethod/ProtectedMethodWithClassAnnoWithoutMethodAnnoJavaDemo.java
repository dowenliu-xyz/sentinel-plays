package org.example.eff.block.basic.demos.protectedMethod;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Greeting.doBlockHandler;
import static org.example.eff.block.basic.biz.Greeting.doGreeting;

@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler")
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
    public String classBlockHandler(@Nullable String name, @Nullable BlockException e) {
        return doBlockHandler(name, e);
    }
}
