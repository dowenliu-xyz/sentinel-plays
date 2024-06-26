package org.example.df.demos.handler.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doDefaultFallback;
import static org.example.df.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
public class SelfHandlersJavaDemo {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback", fallbackClass = SelfHandlersJavaDemo.class)
    public String greeting(String name) {
        return doGreeting(name);
    }

    private static String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
