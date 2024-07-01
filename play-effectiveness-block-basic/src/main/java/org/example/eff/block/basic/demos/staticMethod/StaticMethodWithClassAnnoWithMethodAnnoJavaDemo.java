package org.example.eff.block.basic.demos.staticMethod;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Greeting.doBlockHandler;
import static org.example.eff.block.basic.biz.Greeting.doGreeting;

@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler")
public class StaticMethodWithClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "methodBlockHandler")
    @NotNull
    public static String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @SuppressWarnings("unused")
    @NotNull
    public String classBlockHandler(@Nullable String name, @Nullable BlockException e) {
        return "";
    }

    @NotNull
    public String methodBlockHandler(@Nullable String name, @Nullable BlockException e) {
        return doBlockHandler(name, e);
    }
}
