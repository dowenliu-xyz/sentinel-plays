// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.interfaces.cglib.biz.EffAnno;
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.interfaces.cglib.biz.Greeting.doDefaultFallback;

/**
 * Case: Case(sn=0284, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public interface Case0284JavaInterfaceForKotlin {

    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    default String superClassHandler(@Nullable Throwable e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    default String superClassHandler() {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback();
    }

    @NotNull
    default String methodHandler(@Nullable Throwable e) {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    default String methodHandler() {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback();
    }

}
