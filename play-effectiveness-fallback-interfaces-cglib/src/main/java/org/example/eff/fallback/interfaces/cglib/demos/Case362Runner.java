package org.example.eff.fallback.interfaces.cglib.demos;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.example.eff.fallback.interfaces.cglib.biz.Run.detectEffectiveness;
import static org.example.eff.fallback.interfaces.cglib.biz.Run.detectProxyType;

@ConditionalOnProperty(name = "run.only", havingValue = "case362", matchIfMissing = true)
@Component
@Slf4j
@Order(362)
public class Case362Runner implements CommandLineRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        String proxyType = detectProxyType(applicationContext, "362");
        log.info("case result: {},{},{}",
                String.join(",",
                        "362",
                        "No",
                        "WithAnnoNoAttrAbstract",
                        "WithBody",
                        "No",
                        "WithoutAnno",
                        "No"
                        ),
                detectEffectiveness(applicationContext, "362"),
                proxyType);
    }
}
