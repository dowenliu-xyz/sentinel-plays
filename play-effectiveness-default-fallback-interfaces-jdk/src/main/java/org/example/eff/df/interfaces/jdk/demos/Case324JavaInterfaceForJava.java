// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.interfaces.jdk.biz.EffAnno;
import org.example.eff.df.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.interfaces.jdk.biz.Greeting.doDefaultFallback;

/**
 * Case: Case(sn=324, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public interface Case324JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    default String classHandler(@Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    default String classHandler() {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback();
    }

}
