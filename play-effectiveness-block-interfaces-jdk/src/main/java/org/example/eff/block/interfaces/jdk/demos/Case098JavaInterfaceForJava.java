// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=098, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
public interface Case098JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

}
