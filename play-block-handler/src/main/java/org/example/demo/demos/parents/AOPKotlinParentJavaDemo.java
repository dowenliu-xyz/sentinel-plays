package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Greeting.doBlockHandle;
import static org.example.demo.biz.Greeting.doGreeting;

@SuppressWarnings("unused")
@Component
@Slf4j
public class AOPKotlinParentJavaDemo extends AOPKotlinParentForJava {
    @NotNull
    @Override
    public String greeting(String name) {
        return doGreeting(name);
    }

    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
