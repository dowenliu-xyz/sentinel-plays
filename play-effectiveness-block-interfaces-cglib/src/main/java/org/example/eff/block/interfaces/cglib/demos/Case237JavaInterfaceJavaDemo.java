// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.interfaces.cglib.biz.EffAnno;
import org.example.eff.block.interfaces.cglib.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.block.interfaces.cglib.biz.Greeting.doBlockHandler;import static org.example.eff.block.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=237, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case237JavaInterfaceJavaDemo implements Case237JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @NotNull
    public String superClassHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doBlockHandler(name, e);
    }

}
