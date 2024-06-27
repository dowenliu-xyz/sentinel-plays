// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=125, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public abstract class Case125JavaSuperForKotlin {

    @SentinelResource(value = "demo")
    @NotNull
    public abstract String greeting(@Nullable String name);

    @NotNull
    public abstract String superClassHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    public abstract String superClassHandler(@Nullable String name);

    @NotNull
    public abstract String classHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    public abstract String classHandler(@Nullable String name);

}
