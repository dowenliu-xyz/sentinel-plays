// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=056, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public interface Case056JavaInterfaceForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String superClassHandler(@Nullable Throwable e);

    @NotNull
    String superClassHandler();

    @NotNull
    String superMethodHandler(@Nullable Throwable e);

    @NotNull
    String superMethodHandler();

    @NotNull
    String methodHandler(@Nullable Throwable e);

    @NotNull
    String methodHandler();

}
