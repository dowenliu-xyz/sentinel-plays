// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=128, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public abstract class Case128JavaSuperForJava {

    @SentinelResource(value = "demo")
    @NotNull
    public abstract String greeting(@Nullable String name);

    @NotNull
    public abstract String superClassHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    public abstract String superClassHandler(@Nullable String name);

}
