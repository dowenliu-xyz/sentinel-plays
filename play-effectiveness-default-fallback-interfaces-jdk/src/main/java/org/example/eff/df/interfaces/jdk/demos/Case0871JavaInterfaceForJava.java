// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0871, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case0871JavaInterfaceForJava {

    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
