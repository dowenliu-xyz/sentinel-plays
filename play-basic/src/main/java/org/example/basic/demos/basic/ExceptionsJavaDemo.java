package org.example.basic.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.basic.biz.Greeting.doGreeting;

@Component
@SuppressWarnings({"unused"})
public class ExceptionsJavaDemo {
    @SentinelResource(value = "demo", exceptionsToTrace = {})
    public String greeting1(String name) {
        return doGreeting(name);
    }

    @SentinelResource(value = "demo", exceptionsToIgnore = Throwable.class)
    public String greeting2(String name) {
        return doGreeting(name);
    }

    @SentinelResource(
            value = "demo",
            exceptionsToTrace = {IllegalStateException.class, IllegalArgumentException.class},
            exceptionsToIgnore = {IndexOutOfBoundsException.class, IllegalArgumentException.class}
    )
    public String greeting3(String name) {
        return doGreeting(name);
    }

    @SentinelResource(
            value = "demo",
            exceptionsToTrace = {RuntimeException.class},
            exceptionsToIgnore = {Exception.class}
    )
    public String greeting4(String name) {
        return doGreeting(name);
    }
}
