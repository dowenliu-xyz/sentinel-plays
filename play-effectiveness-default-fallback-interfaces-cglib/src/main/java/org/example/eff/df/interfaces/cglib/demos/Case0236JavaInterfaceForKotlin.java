// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0236, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public interface Case0236JavaInterfaceForKotlin {

    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    String superClassHandler(@Nullable Throwable e);

    @NotNull
    String superClassHandler();

    @NotNull
    String classHandler(@Nullable Throwable e);

    @NotNull
    String classHandler();

}
