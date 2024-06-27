package org.example.eff.block.basic.demos.single;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static org.example.eff.block.basic.biz.Run.expectAspectNotTakeEffect;
import static org.example.eff.block.basic.biz.Run.expectBlockHandle;

@ConditionalOnProperty(name = "run.only", havingValue = "single", matchIfMissing = true)
@Component
@RequiredArgsConstructor
public class SingleRunner implements CommandLineRunner {
    private final SingleWithClassAnnoWithMethodAnnoJavaDemo singleWithClassAnnoWithMethodAnnoJavaDemo;
    private final SingleWithClassAnnoWithMethodAnnoKotlinDemo singleWithClassAnnoWithMethodAnnoKotlinDemo;
    private final SingleWithClassAnnoWithoutMethodAnnoJavaDemo singleWithClassAnnoWithoutMethodAnnoJavaDemo;
    private final SingleWithClassAnnoWithoutMethodAnnoKotlinDemo singleWithClassAnnoWithoutMethodAnnoKotlinDemo;
    private final SingleWithoutClassAnnoWithMethodAnnoJavaDemo singleWithoutClassAnnoWithMethodAnnoJavaDemo;
    private final SingleWithoutClassAnnoWithMethodAnnoKotlinDemo singleWithoutClassAnnoWithMethodAnnoKotlinDemo;

    @Override
    public void run(String... args) {
        // 类注解 + 方法注解。方法注解生效
        expectBlockHandle(singleWithClassAnnoWithMethodAnnoJavaDemo::greeting);
        expectBlockHandle(singleWithClassAnnoWithMethodAnnoKotlinDemo::greeting);
        // 仅有类注解，类注解不生效
        expectAspectNotTakeEffect(singleWithClassAnnoWithoutMethodAnnoJavaDemo::greeting);
        expectAspectNotTakeEffect(singleWithClassAnnoWithoutMethodAnnoKotlinDemo::greeting);
        // 仅有方法注解，方法注解生效
        expectBlockHandle(singleWithoutClassAnnoWithMethodAnnoJavaDemo::greeting);
        expectBlockHandle(singleWithoutClassAnnoWithMethodAnnoKotlinDemo::greeting);
    }
}
