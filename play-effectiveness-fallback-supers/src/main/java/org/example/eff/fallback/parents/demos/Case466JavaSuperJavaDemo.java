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
 * Case: Case(sn=466, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case466JavaSuperJavaDemo extends Case466JavaSuperForJava {

    @SentinelResource(value = "demo", fallback = "methodHandler")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @Override
    @NotNull
    public String methodHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doFallback(name, e);
    }

    @NotNull
    public String methodHandler(@Nullable String name) {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doFallback(name);
    }

}
