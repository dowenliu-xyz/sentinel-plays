// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0360, classAnnoOnSuper=WithAttr, originMethodInSuper=None, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@Component
public class Case0360JavaSuperJavaDemo extends Case0360JavaSuperForJava {

    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
