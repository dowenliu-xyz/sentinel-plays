package org.example.eff.block.combine.demos.case01;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@ConditionalOnProperty(name = "run.only", havingValue = "case01")
@Component
@Slf4j
@RequiredArgsConstructor
public class Case01Runner implements CommandLineRunner {
    private final Case01JavaSuperJavaInterfaceJavaDemo demo;

    @Override
    public void run(String... args) {
        log.info("first result: {}", demo.greeting("abc"));
        // 启动一个新线程把限流额度占用，之后的请求就一定会触发限流
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread thread = new Thread(() -> {
            try (Entry ignored1 = SphU.entry("demo")) {
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
        log.info("second result: {}", demo.greeting("abc"));
    }
}
