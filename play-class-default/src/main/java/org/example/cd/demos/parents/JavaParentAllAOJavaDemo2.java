package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, all defaultFallback method overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 * TODO 类注解时没有提示 shadow ，方法设置 defaultFallback 后有提示
 */
@Component
@Primary
public class JavaParentAllAOJavaDemo2 extends JavaParentAllAOForJava {
    @SentinelResource(value = "demo")
    public String greeting(String name) {
        return doGreeting(name);
    }

    @Override
    protected String defaultFallback() {
        return doDefaultFallback();
    }

    @Override
    protected String defaultFallback(Throwable e) {
        return doDefaultFallback(e);
    }
}
