// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.interfaces.jdk.biz.EffAnno;
import org.example.eff.block.interfaces.jdk.biz.HandlerLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.eff.block.interfaces.jdk.biz.Greeting.doBlockHandler;

/**
 * Case: Case(sn=024, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case024JavaInterfaceJavaDemo implements Case024JavaInterfaceForJava {

    @Override
    @NotNull
    public String superClassHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperClassAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doBlockHandler(name, e);
    }

    @Override
    @NotNull
    public String superMethodHandler(@Nullable String name, @Nullable BlockException e) {
        return EffAnno.SuperMethodAnno.name() + ":" + HandlerLocation.Class.name() + ":" + doBlockHandler(name, e);
    }

}
