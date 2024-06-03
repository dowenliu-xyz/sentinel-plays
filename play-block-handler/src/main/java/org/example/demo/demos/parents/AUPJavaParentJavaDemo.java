package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doBlockHandle;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AUPJavaParentJavaDemo extends AUPJavaParentForJava {
    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
