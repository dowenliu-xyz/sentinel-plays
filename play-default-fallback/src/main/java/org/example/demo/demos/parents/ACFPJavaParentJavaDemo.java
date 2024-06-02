package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

@Component
public class ACFPJavaParentJavaDemo extends ACFPJavaParentForJava {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
