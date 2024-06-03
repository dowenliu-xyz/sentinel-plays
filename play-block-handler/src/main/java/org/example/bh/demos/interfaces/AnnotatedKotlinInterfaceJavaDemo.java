package org.example.bh.demos.interfaces;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doBlockHandle;
import static org.example.bh.biz.Greeting.doGreeting;

/**
 * case impl: annotation in interface
 * <br/>
 * Aspect DOES NOT take effect, fallback does not take effect
 */
@SuppressWarnings("unused")
@Component
@Slf4j
public class AnnotatedKotlinInterfaceJavaDemo implements AnnotatedKotlinInterfaceForJava {
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
