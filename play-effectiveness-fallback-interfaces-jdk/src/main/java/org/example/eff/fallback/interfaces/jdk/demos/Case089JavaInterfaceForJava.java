// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.fallback.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=089, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public interface Case089JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    default String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    String superClassHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String superClassHandler(@Nullable String name);

    @NotNull
    String classHandler(@Nullable String name, @Nullable Throwable e);

    @NotNull
    String classHandler(@Nullable String name);

}
