package org.example.eff.df.interfaces.cglib.demos;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.example.eff.df.interfaces.cglib.biz.Run.detectEffectiveness;
import static org.example.eff.df.interfaces.cglib.biz.Run.detectProxyType;

@ConditionalOnProperty(name = "run.only", havingValue = "case0438", matchIfMissing = true)
@Component
@Slf4j
@Order(438)
public class Case0438Runner implements CommandLineRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        String proxyType = detectProxyType(applicationContext, "0438");
        log.info("case result: {},{},{}",
                String.join(",",
                        "0438",
                        "WithoutAttr",
                        "WithAnnoHavingAttrAbstract",
                        "WithBody",
                        "None",
                        "WithoutAnno",
                        "No"
                        ),
                detectEffectiveness(applicationContext, "0438"),
                proxyType);
    }
}
