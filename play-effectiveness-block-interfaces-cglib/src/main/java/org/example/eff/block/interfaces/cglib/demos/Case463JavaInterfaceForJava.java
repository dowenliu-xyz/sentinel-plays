// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=463, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case463JavaInterfaceForJava {

    @NotNull
    String classHandler(@Nullable String name, @Nullable BlockException e);

    @NotNull
    String methodHandler(@Nullable String name, @Nullable BlockException e);

}