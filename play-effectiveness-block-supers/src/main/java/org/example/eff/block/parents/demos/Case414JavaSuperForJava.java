// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=414, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public abstract class Case414JavaSuperForJava {

    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}