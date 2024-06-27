package org.example.eff.fallback.combine.demos.case01;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;

import static org.example.eff.fallback.combine.biz.Greeting.doGreeting;

public interface JavaInterface {
    @SentinelResource(value = "demo", fallback = "handlerByInterface")
    @NotNull
    default String greeting(String name) {
        return "itf:" + doGreeting(name);
    }
}
