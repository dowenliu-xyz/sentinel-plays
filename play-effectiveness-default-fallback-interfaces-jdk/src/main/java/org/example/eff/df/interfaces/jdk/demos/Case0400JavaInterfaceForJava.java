// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0400, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo")
public interface Case0400JavaInterfaceForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String superMethodHandler(@Nullable Throwable e);

    @NotNull
    String superMethodHandler();

    @NotNull
    String methodHandler(@Nullable Throwable e);

    @NotNull
    String methodHandler();

}