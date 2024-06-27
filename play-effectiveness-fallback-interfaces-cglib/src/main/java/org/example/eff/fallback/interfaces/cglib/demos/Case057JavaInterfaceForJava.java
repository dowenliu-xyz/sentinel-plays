// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=057, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public interface Case057JavaInterfaceForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String superClassHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String superClassHandler(@Nullable String name);

    @NotNull
    String superMethodHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String superMethodHandler(@Nullable String name);

}
