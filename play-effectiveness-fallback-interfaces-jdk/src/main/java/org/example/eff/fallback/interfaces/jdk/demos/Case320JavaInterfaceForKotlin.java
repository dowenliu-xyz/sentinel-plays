// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=320, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public interface Case320JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
