// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=379, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public abstract class Case379JavaSuperForJava {

    @SentinelResource(value = "demo")
    @NotNull
    public abstract String greeting(@Nullable String name);

}
