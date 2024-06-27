package org.example.eff.df.combine.demos.case01;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.combine.biz.Greeting.doGreeting;

public class JavaSuper {
    @SentinelResource(value = "demo", defaultFallback = "handlerBySuper")
    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }
}
