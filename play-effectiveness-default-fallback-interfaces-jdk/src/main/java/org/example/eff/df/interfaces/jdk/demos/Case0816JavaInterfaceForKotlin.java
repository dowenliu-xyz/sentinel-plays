// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0816, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case0816JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String classHandler(@Nullable Throwable e);

    @NotNull
    String classHandler();

}
