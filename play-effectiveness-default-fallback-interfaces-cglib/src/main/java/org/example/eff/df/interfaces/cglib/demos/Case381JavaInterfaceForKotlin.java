// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import org.example.eff.df.interfaces.cglib.biz.EffAnno;
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.interfaces.cglib.biz.Greeting.doDefaultFallback;
import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=381, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case381JavaInterfaceForKotlin {

    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    default String classHandler(@Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    default String classHandler() {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback();
    }

    @NotNull
    default String methodHandler(@Nullable Throwable e) {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    default String methodHandler() {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback();
    }

}
