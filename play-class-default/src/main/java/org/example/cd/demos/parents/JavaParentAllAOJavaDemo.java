package org.example.cd.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

import static org.example.cd.biz.Greeting.doDefaultFallback;
import static org.example.cd.biz.Greeting.doGreeting;

/**
 * case: annotation on parent class, all defaultFallback method overridden
 * <br/>
 * Aspect takes effect, defaultFallback takes effect.
 * TODO 类注解时没有提示 shadow，但在父类中的提示，但提示 shadow 方法没有指向子类重写方法
 */
@Component
public class JavaParentAllAOJavaDemo extends JavaParentAllAOForJava {
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
