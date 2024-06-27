// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.parents.biz.EffAnno;
import org.example.eff.block.parents.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static org.example.eff.block.parents.biz.Greeting.doBlockHandler;
import static org.example.eff.block.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=256, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
public abstract class Case256JavaSuperForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    @NotNull
    public String greeting(@Nullable String name) {
        return "super:" + doGreeting(name);
    }

    @NotNull
    public String superMethodHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Super.name() + ":" + doBlockHandler(name, e);
    }

}