package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.doFirst;
import static org.example.demo.biz.Biz.doSecond;

@Component
public class FHSNJavaHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = FHSNJavaHandlerForJava.class) // TODO 没有提示修改 visibility
    @Override
    public String first() {
        return doFirst();
    }

    @SentinelResource
    @Override
    public Integer second() {
        return doSecond();
    }
}
