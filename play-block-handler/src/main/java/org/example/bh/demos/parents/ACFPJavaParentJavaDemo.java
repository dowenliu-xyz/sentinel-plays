package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doGreeting;

@Component
public class ACFPJavaParentJavaDemo extends ACFPJavaParentForJava {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    public String greeting(String name) {
        return doGreeting(name);
    }
}
