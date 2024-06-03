package org.example.fs.demos.parents;

import static org.example.fs.biz.Greeting.doFallback;

public class JavaParentAllLOForKotlin {
    public String fallback(String name, Throwable e) {
        return "";
    }

    public String fallback(String name) {
        return doFallback(name);
    }
}
