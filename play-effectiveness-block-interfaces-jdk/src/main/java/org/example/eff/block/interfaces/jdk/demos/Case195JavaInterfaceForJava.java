// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=195, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
public interface Case195JavaInterfaceForJava {

    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String superClassHandler(@Nullable String name, @Nullable BlockException e);

    @NotNull
    String classHandler(@Nullable String name, @Nullable BlockException e);

}
