// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0954, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=None, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public abstract class Case0954JavaSuperForJava {

    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
