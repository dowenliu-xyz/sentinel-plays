package org.example.basic.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.basic.biz.Greeting;
import org.springframework.stereotype.Component;

@Component
public class ACFPKotlinParentJavaDemo extends ACFPKotlinParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }
}
