// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=397, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case397JavaInterfaceForJava {

    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    String classHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String classHandler(@Nullable String name);

    @NotNull
    String methodHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String methodHandler(@Nullable String name);

}
