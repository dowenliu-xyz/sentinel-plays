package org.example.df;

import lombok.RequiredArgsConstructor;
import org.example.df.demos.basic.BasicClassJavaDemo;
import org.example.df.demos.basic.BasicClassKotlinDemo;
import org.example.df.demos.basic.BasicJavaDemo;
import org.example.df.demos.basic.BasicKotlinDemo;
import org.example.df.demos.handler.other.JavaHandlersJavaDemo;
import org.example.df.demos.handler.other.JavaHandlersKotlinDemo;
import org.example.df.demos.handler.other.KotlinHandlersJavaDemo;
import org.example.df.demos.handler.other.KotlinHandlersKotlinDemo;
import org.example.df.demos.handler.self.SelfHandlersJavaDemo;
import org.example.df.demos.handler.self.SelfHandlersKotlinDemo;
import org.example.df.demos.interfaces.*;
import org.example.df.demos.parents.*;
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
            expectDefaultFallback(basicJavaDemo::greeting);
            expectAspectNotTakeEffect(basicClassJavaDemo::greeting);
            expectDefaultFallback(basicKotlinDemo::greeting);
            expectAspectNotTakeEffect(basicClassKotlinDemo::greeting);
        }
        {
            expectDefaultFallback(selfHandlersJavaDemo::greeting);
            expectDefaultFallback(selfHandlersKotlinDemo::greeting);
        }
        {
            expectDefaultFallback(javaHandlersJavaDemo::greeting);
            expectDefaultFallback(kotlinHandlersJavaDemo::greeting);
            expectDefaultFallback(javaHandlersKotlinDemo::greeting);
            expectDefaultFallback(kotlinHandlersKotlinDemo::greeting);
        }
        {
            expectNoDefaultFallbackTakeEffect(acfiJavaInterfaceForJava::greeting);
            expectNoDefaultFallbackTakeEffect(acfiKotlinInterfaceForJava::greeting);
            expectAspectNotTakeEffect(annotatedJavaInterfaceJavaDemo::greeting);
            expectAspectNotTakeEffect(annotatedKotlinInterfaceForJava::greeting);
            expectNoDefaultFallbackTakeEffect(acfiJavaInterfaceForKotlin::greeting);
            expectNoDefaultFallbackTakeEffect(acfiKotlinInterfaceForKotlin::greeting);
            expectAspectNotTakeEffect(annotatedJavaInterfaceForKotlin::greeting);
            expectAspectNotTakeEffect(annotatedKotlinInterfaceForKotlin::greeting);
        }
        {
            expectAspectNotTakeEffect(aapJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aapKotlinParentForJava::greeting);
            expectDefaultFallback(acfpJavaParentJavaDemo::greeting);
            expectDefaultFallback(acfpKotlinParentJavaDemo::greeting);
            expectAspectNotTakeEffect(aopJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aopKotlinParentForJava::greeting);
            expectDefaultFallback(aupJavaParentForJava::greeting);
            expectDefaultFallback(aupKotlinParentForJava::greeting);
            expectAspectNotTakeEffect(aufpJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aufpKotlinParentForJava::greeting);

            expectAspectNotTakeEffect(aapJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aapKotlinParentForKotlin::greeting);
            expectDefaultFallback(acfpJavaParentKotlinDemo::greeting);
            expectDefaultFallback(acfpKotlinParentKotlinDemo::greeting);
            expectAspectNotTakeEffect(aopJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aopKotlinParentForKotlin::greeting);
            expectDefaultFallback(aupJavaParentForKotlin::greeting);
            expectDefaultFallback(aupKotlinParentForKotlin::greeting);
            expectAspectNotTakeEffect(aufpJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aufpKotlinParentForKotlin::greeting);
        }
    }

    private static void expectDefaultFallback(Function<String, String> function) {
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

    private static void expectNoDefaultFallbackTakeEffect(Function<String, String> function) {
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
