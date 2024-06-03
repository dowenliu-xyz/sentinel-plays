package org.example.fs.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.fs.biz.Greeting.doFallback;
import static org.example.fs.biz.Greeting.doGreeting;

@Component
public class JavaParentAllSOJavaDemo extends JavaParentAllSOForJava {
    @SentinelResource(value = "demo", fallback = "fallback")
    public String greeting(String name) {
        return doGreeting(name);
    }

    @Override
    public String fallback(String name) {
        return doFallback(name);
    }
}
