// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos;

import org.example.eff.fallback.interfaces.jdk.biz.EffAnno;
import org.example.eff.fallback.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.interfaces.jdk.biz.Greeting.doFallback;

/**
 * Case: Case(sn=395, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case395JavaInterfaceForKotlin {

    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    default String classHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name, e);
    }

    @NotNull
    default String classHandler(@Nullable String name) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doFallback(name);
    }

}
