package org.example.bh.demos.basic;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doBlockHandle;
import static org.example.bh.biz.Greeting.doGreeting;

/**
 * case: annotation-base bean; annotation on method; fallback in current class
 * <br/>
 * aspect takes effect, fallback takes effect.
 */
@Component
@SuppressWarnings({"unused"})
public class BasicJavaDemo {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
