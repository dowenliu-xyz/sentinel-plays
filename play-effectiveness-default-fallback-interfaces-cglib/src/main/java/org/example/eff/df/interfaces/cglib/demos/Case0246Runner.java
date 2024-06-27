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

@ConditionalOnProperty(name = "run.only", havingValue = "case0246", matchIfMissing = true)
@Component
@Slf4j
@Order(246)
public class Case0246Runner implements CommandLineRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        String proxyType = detectProxyType(applicationContext, "0246");
        log.info("case result: {},{},{}",
                String.join(",",
                        "0246",
                        "WithAttr",
                        "WithoutAnnoWithBody",
                        "Abstract",
                        "None",
                        "None",
                        "Yes"
                        ),
                detectEffectiveness(applicationContext, "0246"),
                proxyType);
    }
}
