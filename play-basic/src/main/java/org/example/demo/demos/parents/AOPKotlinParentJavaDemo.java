package org.example.demo.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doFallback;
import static org.example.demo.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AOPKotlinParentJavaDemo extends AOPKotlinParentForJava {
    @NotNull
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
