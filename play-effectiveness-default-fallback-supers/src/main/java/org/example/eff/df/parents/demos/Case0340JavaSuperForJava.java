// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0340, classAnnoOnSuper=WithAttr, originMethodInSuper=None, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public abstract class Case0340JavaSuperForJava {

    @NotNull
    public abstract String superClassHandler(@Nullable Throwable e);

    @NotNull
    public abstract String superClassHandler();

    @NotNull
    public abstract String methodHandler(@Nullable Throwable e);

    @NotNull
    public abstract String methodHandler();

}
