package org.example.basic.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.basic.biz.Greeting.doFallback;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AUPKotlinParentJavaDemo2 extends AUPKotlinParentForJava {
    private String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
