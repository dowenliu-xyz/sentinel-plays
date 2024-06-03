package org.example.basic.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.example.basic.biz.Greeting;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component
@Slf4j
@Primary
public class AUPJavaParentJavaDemo extends AUPJavaParentForJava {
    private String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
