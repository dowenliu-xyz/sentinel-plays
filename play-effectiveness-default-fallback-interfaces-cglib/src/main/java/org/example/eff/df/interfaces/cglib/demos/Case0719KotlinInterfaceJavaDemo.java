// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0719, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case0719KotlinInterfaceJavaDemo implements Case0719KotlinInterfaceForJava {

    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
