package org.example.demo.demos.parents;

import static org.example.demo.biz.Greeting.doFallback;

public class JavaParentShortNOForJava {
    public String fallback(String name) {
        return doFallback(name);
    }
}
