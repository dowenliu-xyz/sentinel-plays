package org.example.demo.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doFallback;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AUFPJavaParentJavaDemo extends AUFPJavaParentForJava {
    private String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
