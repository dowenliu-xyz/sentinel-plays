package org.example.eff.block.basic.demos.protectedMethod;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Run.expectAspectNotTakeEffect;
import static org.example.eff.block.basic.biz.Run.expectBlockHandle;

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
        // private 方法上注解不生效：AOP 不会增强 private 方法。
        expectBlockHandle(protectedMethodWithClassAnnoWithMethodAnnoJavaDemo::exportGreeting);
        expectBlockHandle(protectedMethodWithClassAnnoWithMethodAnnoKotlinDemo::exportGreeting);
        expectAspectNotTakeEffect(protectedMethodWithClassAnnoWithoutMethodAnnoJavaDemo::exportGreeting);
        expectAspectNotTakeEffect(protectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo::exportGreeting);
        expectBlockHandle(protectedMethodWithoutClassAnnoWithMethodAnnoJavaDemo::exportGreeting);
        expectBlockHandle(protectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo::exportGreeting);
    }
}
