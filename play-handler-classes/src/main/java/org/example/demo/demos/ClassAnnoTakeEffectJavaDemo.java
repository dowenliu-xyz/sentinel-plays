package org.example.demo.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;


@SentinelResource(
        blockHandlerClass = {BlockHandlerClass.class},
        defaultFallback = "defaultFallback",
        fallbackClass = {FallbackClass.class, FallbackClass2.class} // TODO 没有提示清除多余类
)
@SuppressWarnings("unused")
@Component
public class ClassAnnoTakeEffectJavaDemo {
    @SentinelResource
    public String greeting1(String name) {
        return doGreeting(name);
    }
}
