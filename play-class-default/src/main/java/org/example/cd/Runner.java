package org.example.cd;

import lombok.RequiredArgsConstructor;
import org.example.cd.demos.handlers.*;
import org.example.cd.demos.interfaces.*;
import org.example.cd.demos.parents.*;
import org.example.cd.demos.self.SelfJavaDemo;
import org.example.cd.demos.self.SelfKotlinDemo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

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
    private final JavaParentLNJavaDemo javaParentLNJavaDemo;
    private final JavaParentLNKotlinDemo javaParentLNKotlinDemo;
    private final JavaParentLOJavaDemo javaParentLOJavaDemo;
    private final JavaParentLOKotlinDemo javaParentLOKotlinDemo;
    private final JavaParentNJavaDemo javaParentNJavaDemo;
    private final JavaParentNKotlinDemo javaParentNKotlinDemo;
    private final JavaParentSNJavaDemo javaParentSNJavaDemo;
    private final JavaParentSNKotlinDemo javaParentSNKotlinDemo;
    private final JavaParentSOJavaDemo javaParentSOJavaDemo;
    private final JavaParentSOKotlinDemo javaParentSOKotlinDemo;
    private final KotlinParentAllAOJavaDemo kotlinParentAllAOJavaDemo;
    private final KotlinParentAllAOKotlinDemo kotlinParentAllAOKotlinDemo;
    private final KotlinParentAllLOJavaDemo kotlinParentAllLOJavaDemo;
    private final KotlinParentAllLOKotlinDemo kotlinParentAllLOKotlinDemo;
    private final KotlinParentAllNOJavaDemo kotlinParentAllNOJavaDemo;
    private final KotlinParentAllNOKotlinDemo kotlinParentAllNOKotlinDemo;
    private final KotlinParentAllSOJavaDemo kotlinParentAllSOJavaDemo;
    private final KotlinParentAllSOKotlinDemo kotlinParentAllSOKotlinDemo;
    private final KotlinParentLNJavaDemo kotlinParentLNJavaDemo;
    private final KotlinParentLNKotlinDemo kotlinParentLNKotlinDemo;
    private final KotlinParentLOJavaDemo kotlinParentLOJavaDemo;
    private final KotlinParentLOKotlinDemo kotlinParentLOKotlinDemo;
    private final KotlinParentNJavaDemo kotlinParentNJavaDemo;
    private final KotlinParentNKotlinDemo kotlinParentNKotlinDemo;
    private final KotlinParentSNJavaDemo kotlinParentSNJavaDemo;
    private final KotlinParentSNKotlinDemo kotlinParentSNKotlinDemo;
    private final KotlinParentSOJavaDemo kotlinParentSOJavaDemo;
    private final KotlinParentSOKotlinDemo kotlinParentSOKotlinDemo;
    private final JavaAnnotatedInterfaceJavaDemo javaAnnotatedInterfaceJavaDemo;
    private final JavaAnnotatedInterfaceKotlinDemo javaAnnotatedInterfaceKotlinDemo;
    private final KotlinAnnotatedInterfaceJavaDemo kotlinAnnotatedInterfaceJavaDemo;
    private final KotlinAnnotatedInterfaceKotlinDemo kotlinAnnotatedInterfaceKotlinDemo;
    private final JavaFallbackInterfaceJavaDemo javaFallbackInterfaceJavaDemo;
    private final JavaFallbackInterfaceKotlinDemo javaFallbackInterfaceKotlinDemo;
    private final KotlinFallbackInterfaceJavaDemo kotlinFallbackInterfaceJavaDemo;
    private final KotlinFallbackInterfaceKotlinDemo kotlinFallbackInterfaceKotlinDemo;
    private final JavaHandlersJavaDemo javaHandlersJavaDemo;
    private final JavaHandlerInterfaceJavaDemo javaHandlerInterfaceJavaDemo;
    private final JavaHandlersKotlinDemo javaHandlersKotlinDemo;
    private final JavaHandlerInterfaceKotlinDemo javaHandlerInterfaceKotlinDemo;
    private final KotlinHandlersJavaDemo kotlinHandlersJavaDemo;
    private final KotlinHandlerInterfaceJavaDemo kotlinHandlerInterfaceJavaDemo;
    private final KotlinHandlersKotlinDemo kotlinHandlersKotlinDemo;
    private final KotlinHandlerInterfaceKotlinDemo kotlinHandlerInterfaceKotlinDemo;
    private final JavaParentCAJavaDemo javaParentCAJavaDemo;
    private final JavaParentCAKotlinDemo javaParentCAKotlinDemo;
    private final KotlinParentCAJavaDemo kotlinParentCAJavaDemo;
    private final KotlinParentCAKotlinDemo kotlinParentCAKotlinDemo;

    @Override
    public void run(String... args) {
        {
            expectFallback(selfJavaDemo::greeting);
            expectFallback(selfKotlinDemo::greeting);
        }
        {
            expectFallback(javaParentAllAOJavaDemo::greeting);
            expectFallback(javaParentAllAOKotlinDemo::greeting);
            expectFallback(javaParentAllLOJavaDemo::greeting);
            expectFallback(javaParentAllLOKotlinDemo::greeting);
            expectFallback(javaParentAllNOJavaDemo::greeting);
            expectFallback(javaParentAllNOKotlinDemo::greeting);
            expectFallback(javaParentAllSOJavaDemo::greeting);
            expectFallback(javaParentAllSOKotlinDemo::greeting);
            expectFallback(javaParentLNJavaDemo::greeting);
            expectFallback(javaParentLNKotlinDemo::greeting);
            expectFallback(javaParentLOJavaDemo::greeting);
            expectFallback(javaParentLOKotlinDemo::greeting);
            expectFallback(javaParentNJavaDemo::greeting);
            expectFallback(javaParentNKotlinDemo::greeting);
            expectFallback(javaParentSNJavaDemo::greeting);
            expectFallback(javaParentSNKotlinDemo::greeting);
            expectFallback(javaParentSOJavaDemo::greeting);
            expectFallback(javaParentSOKotlinDemo::greeting);
            expectFallback(kotlinParentAllAOJavaDemo::greeting);
            expectFallback(kotlinParentAllAOKotlinDemo::greeting);
            expectFallback(kotlinParentAllLOJavaDemo::greeting);
            expectFallback(kotlinParentAllLOKotlinDemo::greeting);
            expectFallback(kotlinParentAllNOJavaDemo::greeting);
            expectFallback(kotlinParentAllNOKotlinDemo::greeting);
            expectFallback(kotlinParentAllSOJavaDemo::greeting);
            expectFallback(kotlinParentAllSOKotlinDemo::greeting);
            expectFallback(kotlinParentLNJavaDemo::greeting);
            expectFallback(kotlinParentLNKotlinDemo::greeting);
            expectFallback(kotlinParentLOJavaDemo::greeting);
            expectFallback(kotlinParentLOKotlinDemo::greeting);
            expectFallback(kotlinParentNJavaDemo::greeting);
            expectFallback(kotlinParentNKotlinDemo::greeting);
            expectFallback(kotlinParentSNJavaDemo::greeting);
            expectFallback(kotlinParentSNKotlinDemo::greeting);
            expectFallback(kotlinParentSOJavaDemo::greeting);
            expectFallback(kotlinParentSOKotlinDemo::greeting);
            expectFallback(javaParentCAJavaDemo::greeting);
            expectFallback(javaParentCAKotlinDemo::greeting);
            expectFallback(kotlinParentCAJavaDemo::greeting);
            expectFallback(kotlinParentCAKotlinDemo::greeting);
        }
        {
            expectNoFallbackTakeEffect(javaAnnotatedInterfaceJavaDemo::greeting);
            expectNoFallbackTakeEffect(javaAnnotatedInterfaceKotlinDemo::greeting);
            expectNoFallbackTakeEffect(kotlinAnnotatedInterfaceJavaDemo::greeting);
            expectNoFallbackTakeEffect(kotlinAnnotatedInterfaceKotlinDemo::greeting);
            expectNoFallbackTakeEffect(javaFallbackInterfaceJavaDemo::greeting);
            expectNoFallbackTakeEffect(javaFallbackInterfaceKotlinDemo::greeting);
            expectNoFallbackTakeEffect(kotlinFallbackInterfaceJavaDemo::greeting);
            expectNoFallbackTakeEffect(kotlinFallbackInterfaceKotlinDemo::greeting);
        }
        {
            expectFallback(javaHandlersJavaDemo::greeting);
            expectFallback(javaHandlerInterfaceJavaDemo::greeting);
            expectFallback(javaHandlersKotlinDemo::greeting);
            expectFallback(javaHandlerInterfaceKotlinDemo::greeting);
            expectFallback(kotlinHandlersJavaDemo::greeting);
            expectFallback(kotlinHandlerInterfaceJavaDemo::greeting);
            expectFallback(kotlinHandlersKotlinDemo::greeting);
            expectFallback(kotlinHandlerInterfaceKotlinDemo::greeting);
        }
    }

    private static void expectFallback(Function<String, String> function) {
        String result = function.apply("");
        if (!"without error".equals(result)) {
            throw new IllegalStateException("expect \"without error\", but got: \"" + result + "\"");
        }
    }


    @SuppressWarnings("unused")
    private static void expectAspectNotTakeEffect(Function<String, String> function) {
        expectThrows(function, e -> {
            if (!(e instanceof IllegalArgumentException) || !"name is null or empty".equals(e.getMessage())) {
                return false;
            }
            return Arrays.stream(e.getStackTrace()).noneMatch(s -> s.getClassName().contains("SentinelResourceAspect"));
        });
    }

    private static void expectNoFallbackTakeEffect(Function<String, String> function) {
        expectThrows(function, e -> {
            if (!(e instanceof IllegalArgumentException) || !"name is null or empty".equals(e.getMessage())) {
                return false;
            }
            return Arrays.stream(e.getStackTrace()).anyMatch(s -> s.getClassName().contains("SentinelResourceAspect"));
        });
    }

    private static void expectThrows(Function<String, String> function, Predicate<Throwable> predicate) {
        String result;
        try {
            result = function.apply("");
        } catch (Throwable e) {
            if (!predicate.test(e)) {
                throw new IllegalStateException("unexpect", e);
            }
            return;
        }
        throw new IllegalStateException("got: \"" + result + "\"");
    }
}
