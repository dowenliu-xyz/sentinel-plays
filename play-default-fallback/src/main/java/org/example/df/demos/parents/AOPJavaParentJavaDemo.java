package org.example.df.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doDefaultFallback;
import static org.example.df.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AOPJavaParentJavaDemo extends AOPJavaParentForJava {
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
