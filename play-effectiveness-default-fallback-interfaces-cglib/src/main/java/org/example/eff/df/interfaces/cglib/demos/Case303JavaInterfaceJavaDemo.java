// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.interfaces.cglib.biz.EffAnno;
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.interfaces.cglib.biz.Greeting.doDefaultFallback;import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=303, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
public class Case303JavaInterfaceJavaDemo implements Case303JavaInterfaceForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String superMethodHandler(@Nullable Throwable e) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    public String superMethodHandler() {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback();
    }

    @NotNull
    public String classHandler(@Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    public String classHandler() {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback();
    }

}
