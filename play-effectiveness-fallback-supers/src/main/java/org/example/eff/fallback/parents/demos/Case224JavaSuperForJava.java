// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=224, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public abstract class Case224JavaSuperForJava {

    @NotNull
    public abstract String superClassHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    public abstract String superClassHandler(@Nullable String name);

    @NotNull
    public abstract String classHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    public abstract String classHandler(@Nullable String name);

}
