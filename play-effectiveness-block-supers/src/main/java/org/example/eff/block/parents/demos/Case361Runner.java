package org.example.eff.block.parents.demos;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.example.eff.block.parents.biz.Run.detectEffectiveness;

@ConditionalOnProperty(name = "run.only", havingValue = "case361", matchIfMissing = true)
@Component
@Slf4j
@Order(361)
public class Case361Runner implements CommandLineRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        log.info("case result: {},{}",
                String.join(",",
                        "361",
                        "No",
                        "WithAnnoNoAttrAbstract",
                        "WithBody",
                        "No",
                        "WithoutAnno",
                        "Yes"
                        ),
                detectEffectiveness(applicationContext, "361"));
    }
}
