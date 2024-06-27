package org.example.eff.df.basic.demos.staticMethod;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.df.basic.biz.Run.expectAspectNotTakeEffect;

@SuppressWarnings("DuplicatedCode")
@ConditionalOnProperty(name = "run.only", havingValue = "staticMethod", matchIfMissing = true)
@Component
public class StaticMethodRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        // static 方法注解不生效
        expectAspectNotTakeEffect(StaticMethodWithClassAnnoWithMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(StaticMethodWithClassAnnoWithMethodAnnoKotlinDemo::greeting);
        expectAspectNotTakeEffect(StaticMethodWithClassAnnoWithMethodAnnoNoAttrJavaDemo::greeting);
        expectAspectNotTakeEffect(StaticMethodWithClassAnnoWithMethodAnnoNoAttrKotlinDemo::greeting);
        expectAspectNotTakeEffect(StaticMethodWithClassAnnoWithoutMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(StaticMethodWithClassAnnoWithoutMethodAnnoKotlinDemo::greeting);
        expectAspectNotTakeEffect(StaticMethodWithoutClassAnnoWithMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(StaticMethodWithoutClassAnnoWithMethodAnnoKotlinDemo::greeting);
    }
}
