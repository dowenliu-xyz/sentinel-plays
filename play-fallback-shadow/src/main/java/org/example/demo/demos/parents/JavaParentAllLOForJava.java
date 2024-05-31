package org.example.demo.demos.parents;

import static org.example.demo.biz.Greeting.doFallback;

public class JavaParentAllLOForJava {
    public String fallback(String name, Throwable e) {
        return "";
    }

    public String fallback(String name) {
        return doFallback(name);
    }
}
