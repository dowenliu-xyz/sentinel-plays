package org.example.eff.block.basic.demos.staticMethod;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Greeting.doBlockHandler;
import static org.example.eff.block.basic.biz.Greeting.doGreeting;

@Component
public class StaticMethodWithoutClassAnnoWithMethodAnnoJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "methodBlockHandler") // TODO static 方法上注解应该提示不生效
    @NotNull
    public static String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String methodBlockHandler(@Nullable String name, @Nullable BlockException e) {
        return doBlockHandler(name, e);
    }
}
