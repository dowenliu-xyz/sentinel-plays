package org.example.eff.block.basic.demos.single;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Greeting.doBlockHandler;
import static org.example.eff.block.basic.biz.Greeting.doGreeting;

@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler") // TODO 类注解时，没有 defaultFallback 属性时，应该直接提示无效。
public class SingleWithClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "methodBlockHandler")
    @NotNull
    public String greeting(@Nullable String name) {
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
