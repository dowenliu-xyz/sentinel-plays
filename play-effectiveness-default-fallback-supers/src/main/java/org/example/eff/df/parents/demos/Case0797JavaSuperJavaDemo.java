// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import org.example.eff.df.parents.biz.EffAnno;
import org.example.eff.df.parents.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.parents.biz.Greeting.doDefaultFallback;import static org.example.eff.df.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0797, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case0797JavaSuperJavaDemo extends Case0797JavaSuperForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @Override
    @NotNull
    public String superMethodHandler(@Nullable Throwable e) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback(e);
    }

    @Override
    @NotNull
    public String superMethodHandler() {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback();
    }

}
