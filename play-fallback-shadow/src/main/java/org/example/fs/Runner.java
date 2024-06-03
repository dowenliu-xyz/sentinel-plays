package org.example.fs;

import lombok.RequiredArgsConstructor;
import org.example.fs.demos.handler.JavaHandlerJavaDemo;
import org.example.fs.demos.handler.JavaHandlerKotlinDemo;
import org.example.fs.demos.handler.KotlinHandlerJavaDemo;
import org.example.fs.demos.handler.KotlinHandlerKotlinDemo;
import org.example.fs.demos.parents.*;
import org.example.fs.demos.self.SelfJavaDemo;
import org.example.fs.demos.self.SelfKotlinDemo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@SuppressWarnings("DuplicatedCode")
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final SelfJavaDemo selfJavaDemo;
    private final SelfKotlinDemo selfKotlinDemo;
    private final JavaParentAllAOJavaDemo javaParentAllAOJavaDemo;
    private final JavaParentAllAOKotlinDemo javaParentAllAOKotlinDemo;
    private final JavaParentAllLOJavaDemo javaParentAllLOJavaDemo;
    private final JavaParentAllLOKotlinDemo javaParentAllLOKotlinDemo;
    private final JavaParentAllNOJavaDemo javaParentAllNOJavaDemo;
    private final JavaParentAllNOKotlinDemo javaParentAllNOKotlinDemo;
    private final JavaParentAllSOJavaDemo javaParentAllSOJavaDemo;
    private final JavaParentAllSOKotlinDemo javaParentAllSOKotlinDemo;
    private final JavaParentLongNOJavaDemo javaParentLongNOJavaDemo;
    private final JavaParentLongNOKotlinDemo javaParentLongNOKotlinDemo;
    private final JavaParentLongOJavaDemo javaParentLongOJavaDemo;
    private final JavaParentLongOKotlinDemo javaParentLongOKotlinDemo;
    private final JavaParentShortNOJavaDemo javaParentShortNOJavaDemo;
    private final JavaParentShortNOKotlinDemo javaParentShortNOKotlinDemo;
    private final JavaParentShortOJavaDemo javaParentShortOJavaDemo;
    private final JavaParentShortOKotlinDemo javaParentShortOKotlinDemo;
    private final KotlinParentAllAOJavaDemo kotlinParentAllAOJavaDemo;
    private final KotlinParentAllAOKotlinDemo kotlinParentAllAOKotlinDemo;
    private final KotlinParentAllLOJavaDemo kotlinParentAllLOJavaDemo;
    private final KotlinParentAllLOKotlinDemo kotlinParentAllLOKotlinDemo;
    private final KotlinParentAllNOJavaDemo kotlinParentAllNOJavaDemo;
    private final KotlinParentAllNOKotlinDemo kotlinParentAllNOKotlinDemo;
    private final KotlinParentAllSOJavaDemo kotlinParentAllSOJavaDemo;
    private final KotlinParentAllSOKotlinDemo kotlinParentAllSOKotlinDemo;
    private final KotlinParentLongNOJavaDemo kotlinParentLongNOJavaDemo;
    private final KotlinParentLongNOKotlinDemo kotlinParentLongNOKotlinDemo;
    private final KotlinParentLongOJavaDemo kotlinParentLongOJavaDemo;
    private final KotlinParentLongOKotlinDemo kotlinParentLongOKotlinDemo;
    private final KotlinParentShortNOJavaDemo kotlinParentShortNOJavaDemo;
    private final KotlinParentShortNOKotlinDemo kotlinParentShortNOKotlinDemo;
    private final KotlinParentShortOJavaDemo kotlinParentShortOJavaDemo;
    private final KotlinParentShortOKotlinDemo kotlinParentShortOKotlinDemo;
    private final JavaHandlerJavaDemo javaHandlerJavaDemo;
    private final JavaHandlerKotlinDemo javaHandlerKotlinDemo;
    private final KotlinHandlerJavaDemo kotlinHandlerJavaDemo;
    private final KotlinHandlerKotlinDemo kotlinHandlerKotlinDemo;

    @Override
    public void run(String... args) {
        {
            doRun(() -> selfJavaDemo.greeting(""));
            doRun(() -> selfKotlinDemo.greeting(""));
        }
        {
            doRun(() -> javaParentAllAOJavaDemo.greeting(""));
            doRun(() -> javaParentAllAOKotlinDemo.greeting(""));
            doRun(() -> javaParentAllLOJavaDemo.greeting(""));
            doRun(() -> javaParentAllLOKotlinDemo.greeting(""));
            doRun(() -> javaParentAllNOJavaDemo.greeting(""));
            doRun(() -> javaParentAllNOKotlinDemo.greeting(""));
            doRun(() -> javaParentAllSOJavaDemo.greeting(""));
            doRun(() -> javaParentAllSOKotlinDemo.greeting(""));
            doRun(() -> javaParentLongNOJavaDemo.greeting(""));
            doRun(() -> javaParentLongNOKotlinDemo.greeting(""));
            doRun(() -> javaParentLongOJavaDemo.greeting(""));
            doRun(() -> javaParentLongOKotlinDemo.greeting(""));
            doRun(() -> javaParentShortNOJavaDemo.greeting(""));
            doRun(() -> javaParentShortNOKotlinDemo.greeting(""));
            doRun(() -> javaParentShortOJavaDemo.greeting(""));
            doRun(() -> javaParentShortOKotlinDemo.greeting(""));
        }
        {
            doRun(() -> kotlinParentAllAOJavaDemo.greeting(""));
            doRun(() -> kotlinParentAllAOKotlinDemo.greeting(""));
            doRun(() -> kotlinParentAllLOJavaDemo.greeting(""));
            doRun(() -> kotlinParentAllLOKotlinDemo.greeting(""));
            doRun(() -> kotlinParentAllNOJavaDemo.greeting(""));
            doRun(() -> kotlinParentAllNOKotlinDemo.greeting(""));
            doRun(() -> kotlinParentAllSOJavaDemo.greeting(""));
            doRun(() -> kotlinParentAllSOKotlinDemo.greeting(""));
            doRun(() -> kotlinParentLongNOJavaDemo.greeting(""));
            doRun(() -> kotlinParentLongNOKotlinDemo.greeting(""));
            doRun(() -> kotlinParentLongOJavaDemo.greeting(""));
            doRun(() -> kotlinParentLongOKotlinDemo.greeting(""));
            doRun(() -> kotlinParentShortNOJavaDemo.greeting(""));
            doRun(() -> kotlinParentShortNOKotlinDemo.greeting(""));
            doRun(() -> kotlinParentShortOJavaDemo.greeting(""));
            doRun(() -> kotlinParentShortOKotlinDemo.greeting(""));
        }
        {
            doRun(() -> javaHandlerJavaDemo.greeting(""));
            doRun(() -> javaHandlerKotlinDemo.greeting(""));
            doRun(() -> kotlinHandlerJavaDemo.greeting(""));
            doRun(() -> kotlinHandlerKotlinDemo.greeting(""));
        }
    }

    public static void doRun(Supplier<String> supplier) {
        var result = supplier.get();
        if (!"without error".equals(result)) {
            throw new RuntimeException("expect \"without error\", but got \"" + result + "\"");
        }
    }
}
