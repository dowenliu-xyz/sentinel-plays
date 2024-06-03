package org.example.df.demos.parents;

import lombok.extern.slf4j.Slf4j;

import static org.example.df.biz.Greeting.doDefaultFallback;

/**
 * case: Annotation in Child and Fallback in Parent
 */
@SuppressWarnings("unused")
@Slf4j
public class ACFPJavaParentForJava {
    private String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
