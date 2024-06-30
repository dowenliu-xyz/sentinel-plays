package org.example.eff.block.basic.demos.finalMethod;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Run.expectAspectNotTakeEffect;

@ConditionalOnProperty(name = "run.only", havingValue = "final", matchIfMissing = true)
@Component
@RequiredArgsConstructor
public class FinalMethodRunner implements CommandLineRunner {
    private final FinalMethodWithClassAnnoWithMethodAnnoJavaDemo finalMethodWithClassAnnoWithMethodAnnoJavaDemo;
    private final FinalMethodWithClassAnnoWithMethodAnnoKotlinDemo finalMethodWithClassAnnoWithMethodAnnoKotlinDemo;
    private final FinalMethodWithClassAnnoWithoutMethodAnnoJavaDemo finalMethodWithClassAnnoWithoutMethodAnnoJavaDemo;
    private final FinalMethodWithClassAnnoWithoutMethodAnnoKotlinDemo finalMethodWithClassAnnoWithoutMethodAnnoKotlinDemo;
    private final FinalMethodWithoutClassAnnoWithMethodAnnoJavaDemo finalMethodWithoutClassAnnoWithMethodAnnoJavaDemo;
    private final FinalMethodWithoutClassAnnoWithMethodAnnoKotlinDemo finalMethodWithoutClassAnnoWithMethodAnnoKotlinDemo;

    @Override
    public void run(String... args) {
        expectAspectNotTakeEffect(finalMethodWithClassAnnoWithMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(finalMethodWithClassAnnoWithMethodAnnoKotlinDemo::greeting);
        expectAspectNotTakeEffect(finalMethodWithClassAnnoWithoutMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(finalMethodWithoutClassAnnoWithMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(finalMethodWithClassAnnoWithoutMethodAnnoKotlinDemo::greeting);
        expectAspectNotTakeEffect(finalMethodWithoutClassAnnoWithMethodAnnoKotlinDemo::greeting);
    }
}
