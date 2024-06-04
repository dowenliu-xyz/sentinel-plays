package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

/**
 * case: parent annotated and child also annotated
 */
@SentinelResource(defaultFallback = "defaultFallbackParent")
public class JavaParentCAForKotlin {
    protected String defaultFallbackParent() {
        return "";
    }

    protected String defaultFallbackParent(Throwable e) {
        return "";
    }
}
