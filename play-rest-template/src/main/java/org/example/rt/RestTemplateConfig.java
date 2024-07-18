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
