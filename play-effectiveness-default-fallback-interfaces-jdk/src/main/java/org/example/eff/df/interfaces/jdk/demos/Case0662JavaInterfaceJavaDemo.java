// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.interfaces.jdk.biz.EffAnno;
import org.example.eff.df.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.interfaces.jdk.biz.Greeting.doDefaultFallback;

/**
 * Case: Case(sn=0662, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo")
@Component
public class Case0662JavaInterfaceJavaDemo implements Case0662JavaInterfaceForJava {

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