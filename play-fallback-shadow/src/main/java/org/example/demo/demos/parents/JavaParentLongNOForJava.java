package org.example.demo.demos.parents;

import static org.example.demo.biz.Greeting.doFallback;

public class JavaParentLongNOForJava {
    public String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
