package org.example.cd.demos.self;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

@Component
@SentinelResource(defaultFallback = "defaultFallback")
public class SelfJavaDemo {
    @SentinelResource(value = "greeting")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback() {
        return doDefaultFallback();
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
