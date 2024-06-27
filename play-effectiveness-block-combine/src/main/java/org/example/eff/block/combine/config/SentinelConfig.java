package org.example.eff.block.combine.config;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@Configuration
public class SentinelConfig {
    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

    @PostConstruct
    public void initSentinelRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        flowRule.setResource("demo");
        flowRule.setGrade(RuleConstant.FLOW_GRADE_THREAD); // 限流模式 线程数
        flowRule.setCount(1); // 限流阈值
        flowRule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT); // 流控效果 直接拒绝
        rules.add(flowRule);
        FlowRuleManager.loadRules(rules);
    }
}
