// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0652, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo")
public abstract class Case0652JavaSuperForJava {

    @NotNull
    public abstract String greeting(@Nullable String name);

    @NotNull
    public abstract String methodHandler(@Nullable Throwable e);

    @NotNull
    public abstract String methodHandler();

}
