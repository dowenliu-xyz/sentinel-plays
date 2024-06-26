// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.interfaces.jdk.biz.EffAnno;
import org.example.eff.block.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.block.interfaces.jdk.biz.Greeting.doBlockHandler;import static org.example.eff.block.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=261, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case261KotlinInterfaceJavaDemo implements Case261KotlinInterfaceForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

    @Override
    @NotNull
    public String superMethodHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doBlockHandler(name, e);
    }

}
