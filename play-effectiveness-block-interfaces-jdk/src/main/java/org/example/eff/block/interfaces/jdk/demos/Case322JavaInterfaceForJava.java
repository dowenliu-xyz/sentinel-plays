// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.interfaces.jdk.biz.EffAnno;
import org.example.eff.block.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.interfaces.jdk.biz.Greeting.doBlockHandler;

/**
 * Case: Case(sn=322, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public interface Case322JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    String greeting(@Nullable String name);

    @NotNull
    default String classHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doBlockHandler(name, e);
    }

    @NotNull
    default String methodHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.MethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doBlockHandler(name, e);
    }

}
