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
 * Case: Case(sn=314, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public interface Case314JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    default String classHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    default String classHandler(@Nullable String name) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
    }

}
