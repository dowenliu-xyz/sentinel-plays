// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=110, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
public interface Case110JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
