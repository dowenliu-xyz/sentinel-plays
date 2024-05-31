package org.example.demo.demos.parents;

import static org.example.demo.biz.Greeting.doFallback;

public class JavaParentShortNOForKotlin {
    public String fallback(String name) {
        return doFallback(name);
    }
}
