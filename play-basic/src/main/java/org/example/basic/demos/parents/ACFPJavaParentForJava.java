package org.example.basic.demos.parents;

import lombok.extern.slf4j.Slf4j;
import org.example.basic.biz.Greeting;

/**
 * case: Annotation in Child and Fallback in Parent
 */
@SuppressWarnings("unused")
@Slf4j
public class ACFPJavaParentForJava {
    private String fallback(String name, Throwable e) {
        return Greeting.doFallback(name, e);
    }
}
