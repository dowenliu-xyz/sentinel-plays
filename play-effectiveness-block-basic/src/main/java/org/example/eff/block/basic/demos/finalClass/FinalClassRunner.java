package org.example.eff.block.basic.demos.finalClass;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Run.expectAspectNotTakeEffect;

@ConditionalOnProperty(name = "run.only", havingValue = "final", matchIfMissing = true)
@Component
@RequiredArgsConstructor
public class FinalClassRunner implements CommandLineRunner {
    private final FinalClassWithClassAnnoWithoutMethodAnnoJavaDemo finalClassWithClassAnnoWithoutMethodAnnoJavaDemo;
    private final FinalClassWithClassAnnoWithoutMethodAnnoKotlinDemo finalClassWithClassAnnoWithoutMethodAnnoKotlinDemo;

    @Override
    public void run(String... args) {
        // 仅类注解不触发 AOP ， final 类也不会报错
        expectAspectNotTakeEffect(finalClassWithClassAnnoWithoutMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(finalClassWithClassAnnoWithoutMethodAnnoKotlinDemo::greeting);
    }
}
