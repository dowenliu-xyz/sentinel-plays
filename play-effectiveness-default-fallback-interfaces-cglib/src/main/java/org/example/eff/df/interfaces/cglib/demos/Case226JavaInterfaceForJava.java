// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=226, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public interface Case226JavaInterfaceForJava {

    @NotNull
    String superClassHandler(@Nullable Throwable e);

    @NotNull
    String superClassHandler();

    @NotNull
    String methodHandler(@Nullable Throwable e);

    @NotNull
    String methodHandler();

}
