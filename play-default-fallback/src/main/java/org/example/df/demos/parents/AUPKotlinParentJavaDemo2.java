package org.example.df.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doDefaultFallback;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AUPKotlinParentJavaDemo2 extends AUPKotlinParentForJava {
    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
