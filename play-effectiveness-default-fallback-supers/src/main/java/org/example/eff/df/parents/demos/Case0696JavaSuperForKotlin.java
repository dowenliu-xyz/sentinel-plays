// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=0696, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo")
public abstract class Case0696JavaSuperForKotlin {

    @NotNull
    public abstract String classHandler(@Nullable Throwable e);

    @NotNull
    public abstract String classHandler();

}
