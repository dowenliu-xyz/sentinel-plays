// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.block.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=333, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case333JavaSuperJavaDemo extends Case333JavaSuperForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}