package org.example.df.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import static org.example.df.biz.Greeting.doDefaultFallback;

@SuppressWarnings("unused")
@Component
@Slf4j
@Primary
public class AUPJavaParentJavaDemo extends AUPJavaParentForJava {
    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
