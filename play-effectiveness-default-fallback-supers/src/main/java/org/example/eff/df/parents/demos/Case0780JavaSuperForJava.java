// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0780, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=None, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public abstract class Case0780JavaSuperForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
