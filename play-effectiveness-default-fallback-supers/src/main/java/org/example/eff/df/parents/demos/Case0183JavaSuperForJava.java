// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.parents.biz.EffAnno;
import org.example.eff.df.parents.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.df.parents.biz.Greeting.doDefaultFallback;

/**
 * Case: Case(sn=0183, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
public abstract class Case0183JavaSuperForJava {

    @SentinelResource(value = "demo")
    @NotNull
    public abstract String greeting(@Nullable String name);

    @NotNull
    public String superClassHandler(@Nullable Throwable e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback(e);
    }

    @NotNull
    public String superClassHandler() {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doDefaultFallback();
    }

}
