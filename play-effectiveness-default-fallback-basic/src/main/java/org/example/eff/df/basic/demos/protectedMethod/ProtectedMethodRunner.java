package org.example.eff.df.basic.demos.protectedMethod;

import lombok.RequiredArgsConstructor;
import org.example.eff.df.basic.biz.AnnoType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Run.expectAspectNotTakeEffect;
import static org.example.eff.df.basic.biz.Run.expectDefaultFallback;

@SuppressWarnings("DuplicatedCode")
@ConditionalOnProperty(name = "run.only", havingValue = "privateMethod", matchIfMissing = true)
@Component
@RequiredArgsConstructor
public class ProtectedMethodRunner implements CommandLineRunner {
    private final ProtectedMethodWithClassAnnoWithMethodAnnoJavaDemo protectedMethodWithClassAnnoWithMethodAnnoJavaDemo;
    private final ProtectedMethodWithClassAnnoWithMethodAnnoKotlinDemo protectedMethodWithClassAnnoWithMethodAnnoKotlinDemo;
    private final ProtectedMethodWithClassAnnoWithMethodAnnoNoAttrJavaDemo protectedMethodWithClassAnnoWithMethodAnnoNoAttrJavaDemo;
    private final ProtectedMethodWithClassAnnoWithMethodAnnoNoAttrKotlinDemo protectedMethodWithClassAnnoWithMethodAnnoNoAttrKotlinDemo;
    private final ProtectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo protectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo;
    private final ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo protectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo;
    private final ProtectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo protectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo;
    private final ProtectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo protectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo;

    @Override
    public void run(String... args) {
        // protected 方法和 public 几乎没有区别
        expectDefaultFallback(protectedMethodWithClassAnnoWithMethodAnnoJavaDemo::exportGreeting, AnnoType.MethodAnno);
        expectDefaultFallback(protectedMethodWithClassAnnoWithMethodAnnoKotlinDemo::exportGreeting, AnnoType.MethodAnno);
        expectDefaultFallback(protectedMethodWithClassAnnoWithMethodAnnoNoAttrJavaDemo::exportGreeting, AnnoType.ClassAnno);
        expectDefaultFallback(protectedMethodWithClassAnnoWithMethodAnnoNoAttrKotlinDemo::exportGreeting, AnnoType.ClassAnno);
        expectAspectNotTakeEffect(protectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo::exportGreeting);
        expectAspectNotTakeEffect(protectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo::exportGreeting);
        expectDefaultFallback(protectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo::exportGreeting, AnnoType.MethodAnno);
        expectDefaultFallback(protectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo::exportGreeting, AnnoType.MethodAnno);
    }
}
