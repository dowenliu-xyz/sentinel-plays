// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=267, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case267JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String superMethodHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String superMethodHandler(@Nullable String name);

}
