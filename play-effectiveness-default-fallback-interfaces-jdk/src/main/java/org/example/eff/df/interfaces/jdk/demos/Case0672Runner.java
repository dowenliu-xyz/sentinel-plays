package org.example.eff.df.interfaces.jdk.demos;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.example.eff.df.interfaces.jdk.biz.Run.detectEffectiveness;
import static org.example.eff.df.interfaces.jdk.biz.Run.detectProxyType;

@ConditionalOnProperty(name = "run.only", havingValue = "case0672", matchIfMissing = true)
@Component
@Slf4j
@Order(672)
public class Case0672Runner implements CommandLineRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        String proxyType = detectProxyType(applicationContext, "0672");
        log.info("case result: {},{},{}",
                String.join(",",
                        "0672",
                        "None",
                        "WithAnnoHavingAttrWithBody",
                        "None",
                        "WithAttr",
                        "WithoutAnno",
                        "No"
                        ),
                detectEffectiveness(applicationContext, "0672"),
                proxyType);
    }
}