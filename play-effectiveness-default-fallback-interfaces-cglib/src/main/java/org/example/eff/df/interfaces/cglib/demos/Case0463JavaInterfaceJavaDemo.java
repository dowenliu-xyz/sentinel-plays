// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0463, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@Component
public class Case0463JavaInterfaceJavaDemo implements Case0463JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
