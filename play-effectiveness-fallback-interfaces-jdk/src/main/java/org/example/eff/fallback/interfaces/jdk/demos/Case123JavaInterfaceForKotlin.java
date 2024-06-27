// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=123, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public interface Case123JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String superClassHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String superClassHandler(@Nullable String name);

    @NotNull
    String classHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String classHandler(@Nullable String name);

    @NotNull
    String methodHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String methodHandler(@Nullable String name);

}