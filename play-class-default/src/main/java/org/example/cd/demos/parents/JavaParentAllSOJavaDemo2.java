package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, defaultFallback method without throwable parameter overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class JavaParentAllSOJavaDemo2 extends JavaParentAllSOForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    @Override
    protected String defaultFallback() {
        return doDefaultFallback();
    }
}
