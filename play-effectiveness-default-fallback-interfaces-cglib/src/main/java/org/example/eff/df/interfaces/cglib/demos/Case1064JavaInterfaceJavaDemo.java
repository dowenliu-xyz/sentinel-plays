// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=1064, classAnnoOnSuper=None, originMethodInSuper=None, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
public class Case1064JavaInterfaceJavaDemo implements Case1064JavaInterfaceForJava {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
