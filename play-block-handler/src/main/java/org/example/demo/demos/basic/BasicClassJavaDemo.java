package org.example.demo.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doBlockHandle;
import static org.example.demo.biz.Greeting.doGreeting;

/**
 * case: annotation-base bean; annotation on class; fallback in current class
 * <br/>
 * aspect DOES NOT take effect, fallback does not take effect.
 */
@Component
@SuppressWarnings({"unused"})
@Slf4j
@SentinelResource(blockHandler = "blockHandler")
public class BasicClassJavaDemo {
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
