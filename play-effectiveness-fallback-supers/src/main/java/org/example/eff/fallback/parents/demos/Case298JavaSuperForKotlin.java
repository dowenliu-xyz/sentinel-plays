// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=298, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public abstract class Case298JavaSuperForKotlin {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    @NotNull
    public abstract String greeting(@Nullable String name);

    @NotNull
    public abstract String superMethodHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    public abstract String superMethodHandler(@Nullable String name);

}
