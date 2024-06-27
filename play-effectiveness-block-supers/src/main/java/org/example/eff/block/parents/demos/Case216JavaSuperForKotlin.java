// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.parents.biz.EffAnno;
import org.example.eff.block.parents.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.parents.biz.Greeting.doBlockHandler;

/**
 * Case: Case(sn=216, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
public abstract class Case216JavaSuperForKotlin {

    @NotNull
    public String superClassHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doBlockHandler(name, e);
    }

    @NotNull
    public String classHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.ClassAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doBlockHandler(name, e);
    }

}