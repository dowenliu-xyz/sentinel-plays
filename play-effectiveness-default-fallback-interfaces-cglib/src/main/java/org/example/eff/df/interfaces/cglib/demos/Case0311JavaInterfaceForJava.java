// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0311, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public interface Case0311JavaInterfaceForJava {

    @NotNull
    String greeting(@Nullable String name);

}
