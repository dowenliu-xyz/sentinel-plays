// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.fallback.interfaces.jdk.biz.EffAnno;
import org.example.eff.fallback.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.interfaces.jdk.biz.Greeting.doFallback;

/**
 * Case: Case(sn=187, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public interface Case187JavaInterfaceForKotlin {

    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    default String superClassHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    default String superClassHandler(@Nullable String name) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
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
