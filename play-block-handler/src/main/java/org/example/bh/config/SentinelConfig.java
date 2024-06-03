package org.example.bh.config;

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
        // 启动一个新线程把限流额度占用，之后的请求就一定会触发限流
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread thread = new Thread(() -> {
            try (Entry entry = SphU.entry("demo")) {
                countDownLatch.countDown();
                while (true) {
                    //noinspection BusyWait
                    Thread.sleep(1000);
                }
            } catch (Exception ignored) {}
        }, "sentinel-resource-robber");
        thread.setDaemon(true);
        thread.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
