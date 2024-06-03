package org.example.basic.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.basic.biz.Greeting.doFallback;
import static org.example.basic.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AOPJavaParentJavaDemo extends AOPJavaParentForJava {
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
