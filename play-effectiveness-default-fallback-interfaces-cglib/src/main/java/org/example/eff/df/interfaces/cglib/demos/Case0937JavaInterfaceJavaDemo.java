// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.df.interfaces.cglib.biz.EffAnno;
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.df.interfaces.cglib.biz.Greeting.doDefaultFallback;

/**
 * Case: Case(sn=0937, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, classAnnoOnClass=WithAttr, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
public class Case0937JavaInterfaceJavaDemo implements Case0937JavaInterfaceForJava {

    @Override
    @NotNull
    public String classHandler(@Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback(e);
    }

    @Override
    @NotNull
    public String classHandler() {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doDefaultFallback();
    }

}
