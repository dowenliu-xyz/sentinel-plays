// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0584, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo")
public interface Case0584JavaInterfaceForKotlin {

    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
