package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

@Component
public class ACFPKotlinParentJavaDemo extends ACFPKotlinParentForJava {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
