// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=258, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
public interface Case258JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    String superMethodHandler(@Nullable Throwable e);

    @NotNull
    String superMethodHandler();

    @NotNull
    String classHandler(@Nullable Throwable e);

    @NotNull
    String classHandler();

}
