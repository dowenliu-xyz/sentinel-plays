package org.example.fs.demos.parents;

import static org.example.fs.biz.Greeting.doFallback;

public class JavaParentLongNOForJava {
    public String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }
}
