// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=301, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public abstract class Case301JavaSuperForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    @NotNull
    public abstract String greeting(@Nullable String name);

}
