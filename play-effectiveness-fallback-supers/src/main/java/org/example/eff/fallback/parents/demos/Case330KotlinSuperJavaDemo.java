// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.eff.fallback.parents.biz.EffAnno;
import org.example.eff.fallback.parents.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.parents.biz.Greeting.doFallback;

/**
 * Case: Case(sn=330, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "classHandler")
@Component
public class Case330KotlinSuperJavaDemo extends Case330KotlinSuperForJava {

    @Override
    @NotNull
    public String classHandler(@Nullable String name, @Nullable Throwable e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doFallback(name, e);
    }

    @NotNull
    public String classHandler(@Nullable String name) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doFallback(name);
    }

}
