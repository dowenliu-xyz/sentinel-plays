// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0497, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo")
public abstract class Case0497JavaSuperForKotlin {

    @SentinelResource(value = "demo")
    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}