package org.example.demo.demos.parents;

import lombok.extern.slf4j.Slf4j;

import static org.example.demo.biz.Greeting.doFallback;

/**
 * case: Annotation in Child and Fallback in Parent
 */
@SuppressWarnings("unused")
@Slf4j
public class ACFPJavaParentForKotlin {
    private String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
