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
 * Case: Case(sn=183, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
public class Case183KotlinInterfaceJavaDemo implements Case183KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @Override
    @NotNull
    public String superClassHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doBlockHandler(name, e);
    }

    @Override
    @NotNull
    public String classHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doBlockHandler(name, e);
    }

}
