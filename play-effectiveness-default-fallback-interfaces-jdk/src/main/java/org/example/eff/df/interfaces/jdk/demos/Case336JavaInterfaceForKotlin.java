// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=336, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case336JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String methodHandler(@Nullable Throwable e);

    @NotNull
    String methodHandler();

}
