// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=031, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public abstract class Case031JavaSuperForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}