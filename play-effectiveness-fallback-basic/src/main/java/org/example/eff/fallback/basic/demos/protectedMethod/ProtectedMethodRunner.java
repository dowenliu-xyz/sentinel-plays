package org.example.eff.fallback.basic.demos.protectedMethod;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.basic.biz.Run.expectAspectNotTakeEffect;
import static org.example.eff.fallback.basic.biz.Run.expectFallback;

@ConditionalOnProperty(name = "run.only", havingValue = "privateMethod", matchIfMissing = true)
@Component
@RequiredArgsConstructor
public class ProtectedMethodRunner implements CommandLineRunner {
    private final ProtectedMethodWithClassAnnoWithMethodAnnoJavaDemo protectedMethodWithClassAnnoWithMethodAnnoJavaDemo;
    private final ProtectedMethodWithClassAnnoWithMethodAnnoKotlinDemo protectedMethodWithClassAnnoWithMethodAnnoKotlinDemo;
    private final ProtectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo protectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo;
    private final ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo protectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo;
    private final ProtectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo protectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo;
    private final ProtectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo protectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo;

    @Override
    public void run(String... args) {
        // protected 方法和 public 几乎没有区别
        expectFallback(protectedMethodWithClassAnnoWithMethodAnnoJavaDemo::exportGreeting);
        expectFallback(protectedMethodWithClassAnnoWithMethodAnnoKotlinDemo::exportGreeting);
        expectAspectNotTakeEffect(protectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo::exportGreeting);
        expectAspectNotTakeEffect(protectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo::exportGreeting);
        expectFallback(protectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo::exportGreeting);
        expectFallback(protectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo::exportGreeting);
    }
}
