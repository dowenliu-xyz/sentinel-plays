// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0080, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public abstract class Case0080JavaSuperForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    @NotNull
    public abstract String greeting(@Nullable String name);

    @NotNull
    public abstract String superClassHandler(@Nullable Throwable e);

    @NotNull
    public abstract String superClassHandler();

    @NotNull
    public abstract String superMethodHandler(@Nullable Throwable e);

    @NotNull
    public abstract String superMethodHandler();

    @NotNull
    public abstract String classHandler(@Nullable Throwable e);

    @NotNull
    public abstract String classHandler();

}
