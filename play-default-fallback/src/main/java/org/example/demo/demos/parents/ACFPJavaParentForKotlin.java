package org.example.demo.demos.parents;

import lombok.extern.slf4j.Slf4j;

import static org.example.demo.biz.Greeting.doDefaultFallback;

/**
 * case: Annotation in Child and Fallback in Parent
 */
@SuppressWarnings("unused")
@Slf4j
public class ACFPJavaParentForKotlin {
    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
