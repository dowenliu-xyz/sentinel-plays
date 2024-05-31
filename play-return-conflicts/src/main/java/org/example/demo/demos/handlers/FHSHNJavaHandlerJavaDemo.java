package org.example.demo.demos.handlers;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.demo.biz.Demo;
import org.springframework.stereotype.Component;

import static org.example.demo.biz.Biz.doFirst;
import static org.example.demo.biz.Biz.doSecond;

// TODO 没有提示冲突
@Component
public class FHSHNJavaHandlerJavaDemo implements Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = FHSHNJavaHandlerForJava.class) // TODO 没有提示修改 visibility
    @Override
    public String first() {
        return doFirst();
    }

    @SentinelResource(fallback = "fallback", fallbackClass = FHSHNJavaHandlerForJava.class) // TODO 没有提示找不到方法
    @Override
    public Integer second() {
        return doSecond();
    }
}
