package org.example.basic.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.example.basic.biz.Greeting;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AAPJavaParentJavaDemo extends AAPJavaParentForJava {
    @Override
    public String greeting(String name) {
        return Greeting.doGreeting(name);
    }

    private String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
