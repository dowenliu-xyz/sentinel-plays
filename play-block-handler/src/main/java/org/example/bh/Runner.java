package org.example.bh;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.RequiredArgsConstructor;
import org.example.bh.demos.basic.BasicClassJavaDemo;
import org.example.bh.demos.basic.BasicClassKotlinDemo;
import org.example.bh.demos.basic.BasicJavaDemo;
import org.example.bh.demos.basic.BasicKotlinDemo;
import org.example.bh.demos.handler.other.*;
import org.example.bh.demos.handler.self.SelfHandlersJavaDemo;
import org.example.bh.demos.handler.self.SelfHandlersKotlinDemo;
import org.example.bh.demos.interfaces.*;
import org.example.bh.demos.parents.*;
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
    private final JavaHandlerInterfaceJavaDemo javaHandlerInterfaceJavaDemo;
    private final KotlinHandlersJavaDemo kotlinHandlersJavaDemo;
    private final KotlinHandlerInterfaceJavaDemo kotlinHandlerInterfaceJavaDemo;
    private final JavaHandlersKotlinDemo javaHandlersKotlinDemo;
    private final JavaHandlerInterfaceKotlinDemo javaHandlerInterfaceKotlinDemo;
    private final KotlinHandlersKotlinDemo kotlinHandlersKotlinDemo;
    private final KotlinHandlerInterfaceKotlinDemo kotlinHandlerInterfaceKotlinDemo;
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
            expectBlockHandle(basicJavaDemo::greeting);
            expectAspectNotTakeEffect(basicClassJavaDemo::greeting);
            expectBlockHandle(basicKotlinDemo::greeting);
            expectAspectNotTakeEffect(basicClassKotlinDemo::greeting);
        }
        {
            expectBlockHandle(selfHandlersJavaDemo::greeting);
            expectBlockHandle(selfHandlersKotlinDemo::greeting);
        }
        {
            expectBlockHandle(javaHandlersJavaDemo::greeting);
            expectBlockHandle(javaHandlerInterfaceJavaDemo::greeting);
            expectBlockHandle(kotlinHandlersJavaDemo::greeting);
            expectBlockHandle(kotlinHandlerInterfaceJavaDemo::greeting);
            expectBlockHandle(javaHandlersKotlinDemo::greeting);
            expectBlockHandle(javaHandlerInterfaceKotlinDemo::greeting);
            expectBlockHandle(kotlinHandlersKotlinDemo::greeting);
            expectBlockHandle(kotlinHandlerInterfaceKotlinDemo::greeting);
        }
        {
            expectNoBlockHandleTakeEffect(acfiJavaInterfaceForJava::greeting);
            expectNoBlockHandleTakeEffect(acfiKotlinInterfaceForJava::greeting);
            expectAspectNotTakeEffect(annotatedJavaInterfaceJavaDemo::greeting);
            expectAspectNotTakeEffect(annotatedKotlinInterfaceForJava::greeting);
            expectNoBlockHandleTakeEffect(acfiJavaInterfaceForKotlin::greeting);
            expectNoBlockHandleTakeEffect(acfiKotlinInterfaceForKotlin::greeting);
            expectAspectNotTakeEffect(annotatedJavaInterfaceForKotlin::greeting);
            expectAspectNotTakeEffect(annotatedKotlinInterfaceForKotlin::greeting);
        }
        {
            expectAspectNotTakeEffect(aapJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aapKotlinParentForJava::greeting);
            expectBlockHandle(acfpJavaParentJavaDemo::greeting);
            expectBlockHandle(acfpKotlinParentJavaDemo::greeting);
            expectAspectNotTakeEffect(aopJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aopKotlinParentForJava::greeting);
            expectBlockHandle(aupJavaParentForJava::greeting);
            expectBlockHandle(aupKotlinParentForJava::greeting);
            expectAspectNotTakeEffect(aufpJavaParentForJava::greeting);
            expectAspectNotTakeEffect(aufpKotlinParentForJava::greeting);

            expectAspectNotTakeEffect(aapJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aapKotlinParentForKotlin::greeting);
            expectBlockHandle(acfpJavaParentKotlinDemo::greeting);
            expectBlockHandle(acfpKotlinParentKotlinDemo::greeting);
            expectAspectNotTakeEffect(aopJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aopKotlinParentForKotlin::greeting);
            expectBlockHandle(aupJavaParentForKotlin::greeting);
            expectBlockHandle(aupKotlinParentForKotlin::greeting);
            expectAspectNotTakeEffect(aufpJavaParentForKotlin::greeting);
            expectAspectNotTakeEffect(aufpKotlinParentForKotlin::greeting);
        }
    }

    private static void expectBlockHandle(Function<String, String> function) {
        String result = function.apply("");
        if (!"blocked".equals(result)) {
            throw new IllegalStateException("expect \"blocked\", but got: \"" + result + "\"");
        }
    }

    private static void expectAspectNotTakeEffect(Function<String, String> function) {
        expectNoThrowsOrThrows(function, e ->
                Arrays.stream(e.getStackTrace()).noneMatch(s -> s.getClassName().contains("SentinelResourceAspect")));
    }

    private static void expectNoBlockHandleTakeEffect(Function<String, String> function) {
        expectNoThrowsOrThrows(function, BlockException::isBlockException);
    }

    private static void expectNoThrowsOrThrows(Function<String, String> function, Predicate<Throwable> predicate) {
        try {
            var ignored = function.apply("");
        } catch (Throwable e) {
            if (!predicate.test(e)) {
                throw new IllegalStateException("unexpect", e);
            }
        }
    }
}
