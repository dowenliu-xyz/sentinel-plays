package org.example.demo;

import lombok.RequiredArgsConstructor;
import org.example.demo.demos.basic.BasicClassJavaDemo;
import org.example.demo.demos.basic.BasicClassKotlinDemo;
import org.example.demo.demos.basic.BasicJavaDemo;
import org.example.demo.demos.basic.BasicKotlinDemo;
import org.example.demo.demos.handler.other.JavaHandlersJavaDemo;
import org.example.demo.demos.handler.other.JavaHandlersKotlinDemo;
import org.example.demo.demos.handler.other.KotlinHandlersJavaDemo;
import org.example.demo.demos.handler.other.KotlinHandlersKotlinDemo;
import org.example.demo.demos.handler.self.SelfHandlersJavaDemo;
import org.example.demo.demos.handler.self.SelfHandlersKotlinDemo;
import org.example.demo.demos.interfaces.*;
import org.example.demo.demos.parents.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

@SuppressWarnings("DuplicatedCode")
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final BasicJavaDemo basicJavaDemo;
    private final BasicClassJavaDemo basicClassJavaDemo;
    private final BasicKotlinDemo basicKotlinDemo;
    private final BasicClassKotlinDemo basicClassKotlinDemo;
    private final SelfHandlersJavaDemo selfHandlersJavaDemo;
    private final SelfHandlersKotlinDemo selfHandlersKotlinDemo;
    private final JavaHandlersJavaDemo javaHandlersJavaDemo;
    private final KotlinHandlersJavaDemo kotlinHandlersJavaDemo;
    private final JavaHandlersKotlinDemo javaHandlersKotlinDemo;
    private final KotlinHandlersKotlinDemo kotlinHandlersKotlinDemo;
    private final ACFIJavaInterfaceForJava acfiJavaInterfaceForJava;
    private final ACFIKotlinInterfaceForJava acfiKotlinInterfaceForJava;
    private final AnnotatedJavaInterfaceForJava annotatedJavaInterfaceJavaDemo;
    private final AnnotatedKotlinInterfaceForJava annotatedKotlinInterfaceForJava;
    private final ACFIJavaInterfaceForKotlin acfiJavaInterfaceForKotlin;
    private final ACFIKotlinInterfaceForKotlin acfiKotlinInterfaceForKotlin;
    private final AnnotatedJavaInterfaceForKotlin annotatedJavaInterfaceForKotlin;
    private final AnnotatedKotlinInterfaceForKotlin annotatedKotlinInterfaceForKotlin;
    private final AAPJavaParentForJava aapJavaParentForJava;
    private final AAPKotlinParentForJava aapKotlinParentForJava;
    private final ACFPJavaParentJavaDemo acfpJavaParentJavaDemo;
    private final ACFPKotlinParentJavaDemo acfpKotlinParentJavaDemo;
    private final AOPJavaParentForJava aopJavaParentForJava;
    private final AOPKotlinParentForJava aopKotlinParentForJava;
    private final AUPJavaParentForJava aupJavaParentForJava;
    private final AUPKotlinParentForJava aupKotlinParentForJava;
    private final AUFPJavaParentForJava aufpJavaParentForJava;
    private final AUFPKotlinParentForJava aufpKotlinParentForJava;
    private final AAPJavaParentForKotlin aapJavaParentForKotlin;
    private final AAPKotlinParentForKotlin aapKotlinParentForKotlin;
    private final ACFPJavaParentKotlinDemo acfpJavaParentKotlinDemo;
    private final ACFPKotlinParentKotlinDemo acfpKotlinParentKotlinDemo;
    private final AOPJavaParentForKotlin aopJavaParentForKotlin;
    private final AOPKotlinParentForKotlin aopKotlinParentForKotlin;
    private final AUPJavaParentForKotlin aupJavaParentForKotlin;
    private final AUPKotlinParentForKotlin aupKotlinParentForKotlin;
    private final AUFPJavaParentForKotlin aufpJavaParentForKotlin;
    private final AUFPKotlinParentForKotlin aufpKotlinParentForKotlin;

    @Override
    public void run(String... args) {
        {
            expectFallback(basicJavaDemo::greeting);
            expectAspectNotTakeEffect(basicClassJavaDemo::greeting);
            expectFallback(basicKotlinDemo::greeting);
            expectAspectNotTakeEffect(basicClassKotlinDemo::greeting);
        }
        {
            expectFallback(selfHandlersJavaDemo::greeting);
            expectFallback(selfHandlersKotlinDemo::greeting);
        }
        {
            expectFallback(javaHandlersJavaDemo::greeting);
            expectFallback(kotlinHandlersJavaDemo::greeting);
            expectFallback(javaHandlersKotlinDemo::greeting);
            expectFallback(kotlinHandlersKotlinDemo::greeting);
        }
        {
            expectNoFallbackTakeEffect(acfiJavaInterfaceForJava::greeting);
            expectNoFallbackTakeEffect(acfiKotlinInterfaceForJava::greeting);
            expectAspectNotTakeEffect(annotatedJavaInterfaceJavaDemo::greeting);
            expectAspectNotTakeEffect(annotatedKotlinInterfaceForJava::greeting);
            expectNoFallbackTakeEffect(acfiJavaInterfaceForKotlin::greeting);
            expectNoFallbackTakeEffect(acfiKotlinInterfaceForKotlin::greeting);
            expectAspectNotTakeEffect(annotatedJavaInterfaceForKotlin::greeting);
            expectAspectNotTakeEffect(annotatedKotlinInterfaceForKotlin::greeting);
        }
        {
            expectAspectNotTakeEffect(aapJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aapKotlinParentForJava::greeting);
            expectFallback(acfpJavaParentJavaDemo::greeting);
            expectFallback(acfpKotlinParentJavaDemo::greeting);
            expectAspectNotTakeEffect(aopJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aopKotlinParentForJava::greeting);
            expectFallback(aupJavaParentForJava::greeting);
            expectFallback(aupKotlinParentForJava::greeting);
            expectAspectNotTakeEffect(aufpJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aufpKotlinParentForJava::greeting);

            expectAspectNotTakeEffect(aapJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aapKotlinParentForKotlin::greeting);
            expectFallback(acfpJavaParentKotlinDemo::greeting);
            expectFallback(acfpKotlinParentKotlinDemo::greeting);
            expectAspectNotTakeEffect(aopJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aopKotlinParentForKotlin::greeting);
            expectFallback(aupJavaParentForKotlin::greeting);
            expectFallback(aupKotlinParentForKotlin::greeting);
            expectAspectNotTakeEffect(aufpJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aufpKotlinParentForKotlin::greeting);
        }
    }

    private static void expectFallback(Function<String, String> function) {
        String result = function.apply("");
        if (result == null || !result.endsWith(" error")) {
            throw new IllegalStateException("expect \"without error\" or \"with error\", but got: \"" + result + "\"");
        }
    }

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
