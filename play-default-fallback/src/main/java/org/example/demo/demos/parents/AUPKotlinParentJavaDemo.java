package org.example.demo.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doDefaultFallback;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AUPKotlinParentJavaDemo extends AUPKotlinParentForJava {
    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
