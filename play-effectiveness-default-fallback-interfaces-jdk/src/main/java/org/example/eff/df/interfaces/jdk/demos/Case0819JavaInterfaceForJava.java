// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0819, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case0819JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    String greeting(@Nullable String name);

}
