// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.interfaces.jdk.biz.EffAnno;
import org.example.eff.df.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.interfaces.jdk.biz.Greeting.doDefaultFallback;import static org.example.eff.df.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0285, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case0285KotlinInterfaceJavaDemo implements Case0285KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @Override
    @NotNull
    public String superClassHandler(@Nullable Throwable e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback(e);
    }

    @Override
    @NotNull
    public String superClassHandler() {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback();
    }

}
