// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=389, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case389JavaInterfaceForJava {

    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
