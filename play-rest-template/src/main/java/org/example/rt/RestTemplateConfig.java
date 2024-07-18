package org.example.rt;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestTemplateConfig {
    @PostConstruct
    public void initSentinelRules() {
        degradeRules();
        flowRules();
    }

    private static void degradeRules() {
        List<DegradeRule> rules = new ArrayList<>();
        DegradeRule rule = new DegradeRule();
        rule.setResource("GET:localHttpBin/status/500");
        rule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_COUNT);
        rule.setCount(1);
        rule.setTimeWindow(1);
        rule.setMinRequestAmount(1);
        rule.setStatIntervalMs(1000);
        rules.add(rule);
        DegradeRuleManager.loadRules(rules);
    }

    private static void flowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("GET:localHttpBin/status/500");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(2);
        rule.setStrategy(RuleConstant.STRATEGY_DIRECT);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }

    // TODO `blockHandler` 和 `blockHandlerClass` 必须同时使用，或者都不使用。只使用其中任一就报错
    // TODO `fallback` 和 `fallbackClass` 必须同时使用，或者都不使用。只使用其中任一就报错
    // TODO `urlCleaner` 和 `urlCleanerClass` 必须同时使用，或者都不使用。只使用其中任一就报错
    // TODO handler 类必须是 public 的，否则会报 IllegalAccessException 。
    //      从库(`SentinelProtectInterceptor`)反射调用，handlerClass 和 handler 必须是 public 的
    // TODO handler 必须是 `public` 的，否则会在启动时报 IllegalArgumentException 。
    //      原因是 Spring ClassUtils.getStaticMethod 方法使用了 Class#getMethod(String, Class...) 查找方法，
    //      该方法只查找声明的 `public` 方法，跳过所有非 `public` 方法
    // TODO 前后空白，无效标识符
    @Bean
    @SentinelRestTemplate(
            blockHandler = "bh", blockHandlerClass = BlockHandler.class,
            fallback = "fb", fallbackClass = FallbackHandler.class,
            urlCleaner = "uc", urlCleanerClass = UrlCleaner.class
    )
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
