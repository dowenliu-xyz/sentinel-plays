package org.example.fs.demos.parents;

import static org.example.fs.biz.Greeting.doFallback;

public class JavaParentShortNOForKotlin {
    public String fallback(String name) {
        return doFallback(name);
    }
}
