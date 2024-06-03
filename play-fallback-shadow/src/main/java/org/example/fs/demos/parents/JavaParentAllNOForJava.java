package org.example.fs.demos.parents;

import static org.example.fs.biz.Greeting.doFallback;

public class JavaParentAllNOForJava {
    public String fallback(String name, Throwable e) {
        return doFallback(name, e);
    }

    public String fallback(String name) {
        return doFallback(name);
    }
}
