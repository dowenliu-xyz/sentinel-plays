package org.example.eff.block.combine.demos.case01;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;

import static org.example.eff.block.combine.biz.Greeting.doGreeting;

public interface JavaInterface {
    @SentinelResource(value = "demo", blockHandler = "handlerByInterface")
    @NotNull
    default String greeting(String name) {
        return "itf:" + doGreeting(name);
    }
}
