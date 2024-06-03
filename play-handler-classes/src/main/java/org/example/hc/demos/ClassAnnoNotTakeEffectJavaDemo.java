package org.example.hc.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.hc.biz.Greeting.doGreeting;


@SentinelResource(
        blockHandlerClass = {BlockHandlerClass.class},
        defaultFallback = "defaultFallback",
        fallbackClass = {FallbackClass.class, FallbackClass2.class}
)
@SuppressWarnings("unused")
public class ClassAnnoNotTakeEffectJavaDemo {
    public String greeting1(String name) {
        return doGreeting(name);
    }
}
