package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doGreeting;

@SuppressWarnings("DataFlowIssue")
@Component
public class ACFPJavaParentJavaDemo extends ACFPJavaParentForJava {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 没有提示改 visibility
    public String greeting(String name) {
        return doGreeting(name);
    }
}
