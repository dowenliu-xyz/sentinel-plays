// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0206, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@Component
public class Case0206KotlinInterfaceJavaDemo implements Case0206KotlinInterfaceForJava {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
