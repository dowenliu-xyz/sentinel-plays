package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, defaultFallback method with throwable parameter overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
public class JavaParentLOJavaDemo2 extends JavaParentLOForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String defaultFallback() {
        return doDefaultFallback();
    }

    @Override
    protected String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
