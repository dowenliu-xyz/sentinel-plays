// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=262, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case262JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    String superMethodHandler(@Nullable String name, @Nullable BlockException e);

}
