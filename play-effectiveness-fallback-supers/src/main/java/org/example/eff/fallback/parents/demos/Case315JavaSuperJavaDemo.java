// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.fallback.parents.biz.EffAnno;
import org.example.eff.fallback.parents.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.parents.biz.Greeting.doFallback;import static org.example.eff.fallback.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=315, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "classHandler")
@Component
public class Case315JavaSuperJavaDemo extends Case315JavaSuperForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @Override
    @NotNull
    public String classHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doFallback(name, e);
    }

    @NotNull
    public String classHandler(@Nullable String name) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doFallback(name);
    }

}
