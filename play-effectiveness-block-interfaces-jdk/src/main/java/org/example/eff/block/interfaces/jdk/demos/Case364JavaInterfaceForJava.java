// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=364, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public interface Case364JavaInterfaceForJava {

    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
