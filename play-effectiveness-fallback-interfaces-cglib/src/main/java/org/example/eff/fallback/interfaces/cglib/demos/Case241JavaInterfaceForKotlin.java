// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.fallback.interfaces.cglib.biz.EffAnno;
import org.example.eff.fallback.interfaces.cglib.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.interfaces.cglib.biz.Greeting.doFallback;
import static org.example.eff.fallback.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=241, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case241JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    default String superMethodHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    default String superMethodHandler(@Nullable String name) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
    }

    @NotNull
    default String classHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    default String classHandler(@Nullable String name) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
    }

    @NotNull
    default String methodHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    default String methodHandler(@Nullable String name) {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
    }

}
