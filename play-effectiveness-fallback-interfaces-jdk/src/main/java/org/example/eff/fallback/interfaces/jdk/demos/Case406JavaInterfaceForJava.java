// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Case: Case(sn=406, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case406JavaInterfaceForJava {

    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    String methodHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String methodHandler(@Nullable String name);

}
