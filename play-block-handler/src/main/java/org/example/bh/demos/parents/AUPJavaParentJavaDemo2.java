package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.bh.biz.Greeting.doBlockHandle;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AUPJavaParentJavaDemo2 extends AUPJavaParentForJava {
    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
