package org.example.demo.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;


@SentinelResource(
        blockHandlerClass = {BlockHandlerClass.class, BlockHandlerClass2.class},
        defaultFallback = "defaultFallback",
        fallbackClass = {FallbackClass.class, FallbackClass2.class}
)
@SuppressWarnings("unused")
@Component
public class ClassAnnoTakeEffectJavaDemo {
    @SentinelResource
    public String greeting1(String name) {
        return doGreeting(name);
    }
}
