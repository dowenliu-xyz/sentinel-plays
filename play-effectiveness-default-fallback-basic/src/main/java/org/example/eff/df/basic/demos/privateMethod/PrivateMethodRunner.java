package org.example.eff.df.basic.demos.privateMethod;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Run.expectAspectNotTakeEffect;

@ConditionalOnProperty(name = "run.only", havingValue = "privateMethod", matchIfMissing = true)
@Component
@RequiredArgsConstructor
public class PrivateMethodRunner implements CommandLineRunner {
    private final PrivateMethodWithClassAnnoWithMethodAnnoJavaDemo privateMethodWithClassAnnoWithMethodAnnoJavaDemo;
    private final PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo privateMethodWithClassAnnoWithMethodAnnoKotlinDemo;
    private final PrivateMethodWithClassAnnoWithMethodAnnoNoAttrJavaDemo privateMethodWithClassAnnoWithMethodAnnoNoAttrJavaDemo;
    private final PrivateMethodWithClassAnnoWithMethodAnnoNoAttrKotlinDemo privateMethodWithClassAnnoWithMethodAnnoNoAttrKotlinDemo;
    private final PrivateMethodWithClassAnnoWithoutMethodAnnoJavaDemo privateMethodWithClassAnnoWithoutMethodAnnoJavaDemo;
    private final PrivateMethodWithClassAnnoWithoutMethodAnnoKotlinDemo privateMethodWithClassAnnoWithoutMethodAnnoKotlinDemo;
    private final PrivateMethodWithoutClassAnnoWithMethodAnnoJavaDemo privateMethodWithoutClassAnnoWithMethodAnnoJavaDemo;
    private final PrivateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo privateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo;

    @Override
    public void run(String... args) {
        // private 方法上注解不生效：AOP 不会增强 private 方法。
        expectAspectNotTakeEffect(privateMethodWithClassAnnoWithMethodAnnoJavaDemo::exportGreeting);
        expectAspectNotTakeEffect(privateMethodWithClassAnnoWithMethodAnnoKotlinDemo::exportGreeting);
        expectAspectNotTakeEffect(privateMethodWithClassAnnoWithMethodAnnoNoAttrJavaDemo::exportGreeting);
        expectAspectNotTakeEffect(privateMethodWithClassAnnoWithMethodAnnoNoAttrKotlinDemo::exportGreeting);
        expectAspectNotTakeEffect(privateMethodWithClassAnnoWithoutMethodAnnoJavaDemo::exportGreeting);
        expectAspectNotTakeEffect(privateMethodWithClassAnnoWithoutMethodAnnoKotlinDemo::exportGreeting);
        expectAspectNotTakeEffect(privateMethodWithoutClassAnnoWithMethodAnnoJavaDemo::exportGreeting);
        expectAspectNotTakeEffect(privateMethodWithoutClassAnnoWithMethodAnnoKotlinDemo::exportGreeting);
    }
}
