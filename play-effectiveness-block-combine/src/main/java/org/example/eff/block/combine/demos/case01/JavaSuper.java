package org.example.eff.block.combine.demos.case01;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.combine.biz.Greeting.doGreeting;

public class JavaSuper {
    @SentinelResource(value = "demo", blockHandler = "handlerBySuper")
    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }
}
