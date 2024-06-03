package org.example.demo.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import static org.example.demo.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
public abstract class MethodAnnoNotTakeEffectKotlinDemo {
    @SentinelResource(
            blockHandlerClass = {BlockHandlerClass.class},
            fallbackClass = {FallbackClass.class}
    )
    public String greeting1(String name) {
        return doGreeting(name);
    }

    @SentinelResource(
            blockHandlerClass = BlockHandlerClass.class,
            fallbackClass = FallbackClass.class
    )
    public String greeting2(String name) {
        return doGreeting(name);
    }

    @SentinelResource(
            blockHandlerClass = {BlockHandlerClass.class, BlockHandlerClass2.class},
            fallbackClass = {FallbackClass.class, FallbackClass2.class}
    )
    public String greeting3(String name) {
        return doGreeting(name);
    }
}
