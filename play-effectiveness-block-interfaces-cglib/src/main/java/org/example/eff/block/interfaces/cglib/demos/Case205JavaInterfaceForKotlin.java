// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=205, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
public interface Case205JavaInterfaceForKotlin {

    @NotNull
    String greeting(@Nullable String name);

}
