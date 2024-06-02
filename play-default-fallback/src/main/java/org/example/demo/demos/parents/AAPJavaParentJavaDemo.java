package org.example.demo.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doDefaultFallback;
import static org.example.demo.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AAPJavaParentJavaDemo extends AAPJavaParentForJava {
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
