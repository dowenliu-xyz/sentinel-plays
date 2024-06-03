package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doBlockHandle;
import static org.example.bh.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AAPJavaParentJavaDemo extends AAPJavaParentForJava {
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
