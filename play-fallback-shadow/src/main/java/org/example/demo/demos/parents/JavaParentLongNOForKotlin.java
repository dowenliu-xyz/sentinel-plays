package org.example.demo.demos.parents;

import static org.example.demo.biz.Greeting.doFallback;

public class JavaParentLongNOForKotlin {
    public String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
