// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=419, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public abstract class Case419JavaSuperForJava {

    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
