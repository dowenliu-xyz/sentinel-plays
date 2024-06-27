// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.fallback.parents.biz.EffAnno;
import org.example.eff.fallback.parents.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.parents.biz.Greeting.doFallback;
import static org.example.eff.fallback.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=012, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public abstract class Case012JavaSuperForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    public String superClassHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    public String superClassHandler(@Nullable String name) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
    }

    @NotNull
    public String superMethodHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    public String superMethodHandler(@Nullable String name) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
    }

}
