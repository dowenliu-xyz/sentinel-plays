// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.interfaces.cglib.biz.EffAnno;
import org.example.eff.block.interfaces.cglib.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.block.interfaces.cglib.biz.Greeting.doBlockHandler;

/**
 * Case: Case(sn=155, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case155KotlinInterfaceJavaDemo implements Case155KotlinInterfaceForJava {

    @Override
    @NotNull
    public String superClassHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doBlockHandler(name, e);
    }

}