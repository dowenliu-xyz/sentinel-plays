package org.example.pc;

import lombok.RequiredArgsConstructor;
import org.example.pc.biz.Demo;
import org.example.pc.demos.handlers.*;
import org.example.pc.demos.parents.*;
import org.example.pc.demos.self.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@SuppressWarnings("DuplicatedCode")
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final SelfBothFallbackJavaDemo selfBothFallbackJavaDemo;
    private final SelfBothFallbackKotlinDemo selfBothFallbackKotlinDemo;
    private final SelfFirstFallbackJavaDemo selfFirstFallbackJavaDemo;
    private final SelfFirstFallbackKotlinDemo selfFirstFallbackKotlinDemo;
    private final SelfSecondFallbackJavaDemo selfSecondFallbackJavaDemo;
    private final SelfSecondFallbackKotlinDemo selfSecondFallbackKotlinDemo;
    private final SelfNoneFallbackJavaDemo selfNoneFallbackJavaDemo;
    private final SelfNoneFallbackKotlinDemo selfNoneFallbackKotlinDemo;
    private final JavaFHSHHandlerJavaDemo javaFHSHHandlerJavaDemo;
    private final JavaFHSHHandlerKotlinDemo javaFHSHHandlerKotlinDemo;
    private final KotlinFHSHHandlerJavaDemo kotlinFHSHHandlerJavaDemo;
    private final KotlinFHSHHandlerKotlinDemo kotlinFHSHHandlerKotlinDemo;
    private final JavaFHSNHandlerJavaDemo javaFHSNHandlerJavaDemo;
    private final JavaFHSNHandlerKotlinDemo javaFHSNHandlerKotlinDemo;
    private final KotlinFHSNHandlerJavaDemo kotlinFHSNHandlerJavaDemo;
    private final KotlinFHSNHandlerKotlinDemo kotlinFHSNHandlerKotlinDemo;
    private final JavaFHSSHandlerJavaDemo javaFHSSHandlerJavaDemo;
    private final JavaFHSSHandlerKotlinDemo javaFHSSHandlerKotlinDemo;
    private final KotlinFHSSHandlerJavaDemo kotlinFHSSHandlerJavaDemo;
    private final KotlinFHSSHandlerKotlinDemo kotlinFHSSHandlerKotlinDemo;
    private final JavaFNSHHandlerJavaDemo javaFNSHHandlerJavaDemo;
    private final JavaFNSHHandlerKotlinDemo javaFNSHHandlerKotlinDemo;
    private final KotlinFNSHHandlerJavaDemo kotlinFNSHHandlerJavaDemo;
    private final KotlinFNSHHandlerKotlinDemo kotlinFNSHHandlerKotlinDemo;
    private final JavaFSSHHandlerJavaDemo javaFSSHHandlerJavaDemo;
    private final JavaFSSHHandlerKotlinDemo javaFSSHHandlerKotlinDemo;
    private final KotlinFSSHHandlerJavaDemo kotlinFSSHHandlerJavaDemo;
    private final KotlinFSSHHandlerKotlinDemo kotlinFSSHHandlerKotlinDemo;
    private final OFCSCHFCSPJavaParentJavaDemo ofcschfcspJavaParentJavaDemo;
    private final OFCSCHFCSPJavaParentKotlinDemo ofcschfcspJavaParentKotlinDemo;
    private final OFCSCHFCSPKotlinParentJavaDemo ofcschfcspKotlinParentJavaDemo;
    private final OFCSCHFCSPKotlinParentKotlinDemo ofcschfcspKotlinParentKotlinDemo;
    private final OFCSCHFPSCJavaParentJavaDemo ofcschfpscJavaParentJavaDemo;
    private final OFCSCHFPSCJavaParentKotlinDemo ofcschfpscJavaParentKotlinDemo;
    private final OFCSCHFPSCKotlinParentJavaDemo ofcschfpscKotlinParentJavaDemo;
    private final OFCSCHFPSCKotlinParentKotlinDemo ofcschfpscKotlinParentKotlinDemo;
    private final OFCSPHFCSCJavaParentJavaDemo ofcsphfcscJavaParentJavaDemo;
    private final OFCSPHFCSCJavaParentKotlinDemo ofcsphfcscJavaParentKotlinDemo;
    private final OFCSPHFCSCKotlinParentJavaDemo ofcsphfcscKotlinParentJavaDemo;
    private final OFCSPHFCSCKotlinParentKotlinDemo ofcsphfcscKotlinParentKotlinDemo;
    private final OFPSCHFCSCJavaParentJavaDemo ofpschfcscJavaParentJavaDemo;
    private final OFPSCHFCSCJavaParentKotlinDemo ofpschfcscJavaParentKotlinDemo;
    private final OFPSCHFCSCKotlinParentJavaDemo ofpschfcscKotlinParentJavaDemo;
    private final OFPSCHFCSCKotlinParentKotlinDemo ofpschfcscKotlinParentKotlinDemo;
    private final OFCSCHFPSPJavaParentJavaDemo ofcschfpspJavaParentJavaDemo;
    private final OFCSCHFPSPJavaParentKotlinDemo ofcschfpspJavaParentKotlinDemo;
    private final OFCSCHFPSPKotlinParentJavaDemo ofcschfpspKotlinParentJavaDemo;
    private final OFCSCHFPSPKotlinParentKotlinDemo ofcschfpspKotlinParentKotlinDemo;
    private final OFCSPHFCSPJavaParentJavaDemo ofcsphfcspJavaParentJavaDemo;
    private final OFCSPHFCSPJavaParentKotlinDemo ofcsphfcspJavaParentKotlinDemo;
    private final OFCSPHFCSPKotlinParentJavaDemo ofcsphfcspKotlinParentJavaDemo;
    private final OFCSPHFCSPKotlinParentKotlinDemo ofcsphfcspKotlinParentKotlinDemo;
    private final OFCSPHFPSCJavaParentJavaDemo ofcsphfpscJavaParentJavaDemo;
    private final OFCSPHFPSCJavaParentKotlinDemo ofcsphfpscJavaParentKotlinDemo;
    private final OFCSPHFPSCKotlinParentJavaDemo ofcsphfpscKotlinParentJavaDemo;
    private final OFCSPHFPSCKotlinParentKotlinDemo ofcsphfpscKotlinParentKotlinDemo;
    private final OFPSCHFCSPJavaParentJavaDemo ofpschfcspJavaParentJavaDemo;
    private final OFPSCHFCSPJavaParentKotlinDemo ofpschfcspJavaParentKotlinDemo;
    private final OFPSCHFCSPKotlinParentJavaDemo ofpschfcspKotlinParentJavaDemo;
    private final OFPSCHFCSPKotlinParentKotlinDemo ofpschfcspKotlinParentKotlinDemo;
    private final OFPSCHFPSCJavaParentJavaDemo ofpschfpscJavaParentJavaDemo;
    private final OFPSCHFPSCJavaParentKotlinDemo ofpschfpscJavaParentKotlinDemo;
    private final OFPSCHFPSCKotlinParentJavaDemo ofpschfpscKotlinParentJavaDemo;
    private final OFPSCHFPSCKotlinParentKotlinDemo ofpschfpscKotlinParentKotlinDemo;
    private final OFPSPHFCSCJavaParentJavaDemo ofpsphfcscJavaParentJavaDemo;
    private final OFPSPHFCSCJavaParentKotlinDemo ofpsphfcscJavaParentKotlinDemo;
    private final OFPSPHFCSCKotlinParentJavaDemo ofpsphfcscKotlinParentJavaDemo;
    private final OFPSPHFCSCKotlinParentKotlinDemo ofpsphfcscKotlinParentKotlinDemo;
    private final OFCSPHFPSPJavaParentJavaDemo ofcsphfpspJavaParentJavaDemo;
    private final OFCSPHFPSPJavaParentKotlinDemo ofcsphfpspJavaParentKotlinDemo;
    private final OFCSPHFPSPKotlinParentJavaDemo ofcsphfpspKotlinParentJavaDemo;
    private final OFCSPHFPSPKotlinParentKotlinDemo ofcsphfpspKotlinParentKotlinDemo;
    private final OFPSCHFPSPJavaParentJavaDemo ofpschfpspJavaParentJavaDemo;
    private final OFPSCHFPSPJavaParentKotlinDemo ofpschfpspJavaParentKotlinDemo;
    private final OFPSCHFPSPKotlinParentJavaDemo ofpschfpspKotlinParentJavaDemo;
    private final OFPSCHFPSPKotlinParentKotlinDemo ofpschfpspKotlinParentKotlinDemo;

    private final OFPSPHFCSPJavaParentJavaDemo ofpsphfcspJavaParentJavaDemo;
    private final OFPSPHFCSPJavaParentKotlinDemo ofpsphfcspJavaParentKotlinDemo;
    private final OFPSPHFCSPKotlinParentJavaDemo ofpsphfcspKotlinParentJavaDemo;
    private final OFPSPHFCSPKotlinParentKotlinDemo ofpsphfcspKotlinParentKotlinDemo;
    private final OFPSPHFPSCJavaParentJavaDemo ofpsphfpscJavaParentJavaDemo;
    private final OFPSPHFPSCJavaParentKotlinDemo ofpsphfpscJavaParentKotlinDemo;
    private final OFPSPHFPSCKotlinParentJavaDemo ofpsphfpscKotlinParentJavaDemo;
    private final OFPSPHFPSCKotlinParentKotlinDemo ofpsphfpscKotlinParentKotlinDemo;
    private final OFPSPHFPSPJavaParentJavaDemo ofpsphfpspJavaParentJavaDemo;
    private final OFPSPHFPSPJavaParentKotlinDemo ofpsphfpspJavaParentKotlinDemo;
    private final OFPSPHFPSPKotlinParentJavaDemo ofpsphfpspKotlinParentJavaDemo;
    private final OFPSPHFPSPKotlinParentKotlinDemo ofpsphfpspKotlinParentKotlinDemo;

    @Override
    public void run(String... args) {
        {
            expectSecondCallConflict(selfBothFallbackJavaDemo);
            expectSecondCallConflict(selfBothFallbackKotlinDemo);
            expectSecondCallConflict(selfFirstFallbackJavaDemo);
            expectSecondCallConflict(selfFirstFallbackKotlinDemo);
            expectSecondCallNoFallback(selfSecondFallbackJavaDemo);
            expectSecondCallNoFallback(selfSecondFallbackKotlinDemo);
            expectSecondCallNoFallback(selfNoneFallbackJavaDemo);
            expectSecondCallNoFallback(selfNoneFallbackKotlinDemo);
        }
        {
            expectSecondCallConflict(javaFHSHHandlerJavaDemo);
            expectSecondCallConflict(javaFHSHHandlerKotlinDemo);
            expectSecondCallConflict(kotlinFHSHHandlerJavaDemo);
            expectSecondCallConflict(kotlinFHSHHandlerKotlinDemo);
            expectSecondCallNoFallback(javaFHSNHandlerJavaDemo);
            expectSecondCallNoFallback(javaFHSNHandlerKotlinDemo);
            expectSecondCallNoFallback(kotlinFHSNHandlerJavaDemo);
            expectSecondCallNoFallback(kotlinFHSNHandlerKotlinDemo);
            expectSecondCallFallback(javaFHSSHandlerJavaDemo);
            expectSecondCallFallback(javaFHSSHandlerKotlinDemo);
            expectSecondCallFallback(kotlinFHSSHandlerJavaDemo);
            expectSecondCallFallback(kotlinFHSSHandlerKotlinDemo);
            expectSecondCallFallback(javaFNSHHandlerJavaDemo);
            expectSecondCallFallback(javaFNSHHandlerKotlinDemo);
            expectSecondCallFallback(kotlinFNSHHandlerJavaDemo);
            expectSecondCallFallback(kotlinFNSHHandlerKotlinDemo);
            expectSecondCallFallback(javaFSSHHandlerJavaDemo);
            expectSecondCallFallback(javaFSSHHandlerKotlinDemo);
            expectSecondCallFallback(kotlinFSSHHandlerJavaDemo);
            expectSecondCallFallback(kotlinFSSHHandlerKotlinDemo);
        }
        {
            expectSecondCallConflict(ofcschfcspJavaParentJavaDemo);
            expectSecondCallConflict(ofcschfcspJavaParentKotlinDemo);
            expectSecondCallConflict(ofcschfcspKotlinParentJavaDemo);
            expectSecondCallConflict(ofcschfcspKotlinParentKotlinDemo);
            expectSecondCallConflict(ofcschfpscJavaParentJavaDemo);
            expectSecondCallConflict(ofcschfpscJavaParentKotlinDemo);
            expectSecondCallConflict(ofcschfpscKotlinParentJavaDemo);
            expectSecondCallConflict(ofcschfpscKotlinParentKotlinDemo);
            expectSecondCallConflict(ofcsphfcscJavaParentJavaDemo);
            expectSecondCallConflict(ofcsphfcscJavaParentKotlinDemo);
            expectSecondCallConflict(ofcsphfcscKotlinParentJavaDemo);
            expectSecondCallConflict(ofcsphfcscKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpschfcscJavaParentJavaDemo);
            expectSecondCallConflict(ofpschfcscJavaParentKotlinDemo);
            expectSecondCallConflict(ofpschfcscKotlinParentJavaDemo);
            expectSecondCallConflict(ofpschfcscKotlinParentKotlinDemo);
            expectSecondCallConflict(ofcschfpspJavaParentJavaDemo);
            expectSecondCallConflict(ofcschfpspJavaParentKotlinDemo);
            expectSecondCallConflict(ofcschfpspKotlinParentJavaDemo);
            expectSecondCallConflict(ofcschfpspKotlinParentKotlinDemo);
            expectSecondCallConflict(ofcsphfcspJavaParentJavaDemo);
            expectSecondCallConflict(ofcsphfcspJavaParentKotlinDemo);
            expectSecondCallConflict(ofcsphfcspKotlinParentJavaDemo);
            expectSecondCallConflict(ofcsphfcspKotlinParentKotlinDemo);
            expectSecondCallConflict(ofcsphfpscJavaParentJavaDemo);
            expectSecondCallConflict(ofcsphfpscJavaParentKotlinDemo);
            expectSecondCallConflict(ofcsphfpscKotlinParentJavaDemo);
            expectSecondCallConflict(ofcsphfpscKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpschfcspJavaParentJavaDemo);
            expectSecondCallConflict(ofpschfcspJavaParentKotlinDemo);
            expectSecondCallConflict(ofpschfcspKotlinParentJavaDemo);
            expectSecondCallConflict(ofpschfcspKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpschfpscJavaParentJavaDemo);
            expectSecondCallConflict(ofpschfpscJavaParentKotlinDemo);
            expectSecondCallConflict(ofpschfpscKotlinParentJavaDemo);
            expectSecondCallConflict(ofpschfpscKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpsphfcscJavaParentJavaDemo);
            expectSecondCallConflict(ofpsphfcscJavaParentKotlinDemo);
            expectSecondCallConflict(ofpsphfcscKotlinParentJavaDemo);
            expectSecondCallConflict(ofpsphfcscKotlinParentKotlinDemo);
            expectSecondCallConflict(ofcsphfpspJavaParentJavaDemo);
            expectSecondCallConflict(ofcsphfpspJavaParentKotlinDemo);
            expectSecondCallConflict(ofcsphfpspKotlinParentJavaDemo);
            expectSecondCallConflict(ofcsphfpspKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpschfpspJavaParentJavaDemo);
            expectSecondCallConflict(ofpschfpspJavaParentKotlinDemo);
            expectSecondCallConflict(ofpschfpspKotlinParentJavaDemo);
            expectSecondCallConflict(ofpschfpspKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpsphfcspJavaParentJavaDemo);
            expectSecondCallConflict(ofpsphfcspJavaParentKotlinDemo);
            expectSecondCallConflict(ofpsphfcspKotlinParentJavaDemo);
            expectSecondCallConflict(ofpsphfcspKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpsphfpscJavaParentJavaDemo);
            expectSecondCallConflict(ofpsphfpscJavaParentKotlinDemo);
            expectSecondCallConflict(ofpsphfpscKotlinParentJavaDemo);
            expectSecondCallConflict(ofpsphfpscKotlinParentKotlinDemo);
            expectSecondCallConflict(ofpsphfpspJavaParentJavaDemo);
            expectSecondCallConflict(ofpsphfpspJavaParentKotlinDemo);
            expectSecondCallConflict(ofpsphfpspKotlinParentJavaDemo);
            expectSecondCallConflict(ofpsphfpspKotlinParentKotlinDemo);
        }
    }

    private static void expectSecondCallConflict(Demo demo) {
        try {
            demo.consumeString("");
        } catch (Throwable ignored) {
        }
        try {
            demo.consumeInteger(0);
        } catch (IllegalArgumentException e) {
            if ("argument type mismatch".equals(e.getMessage())) return;
            throw e;
        }
    }

    private static void expectSecondCallNoFallback(Demo demo) {
        try {
            demo.consumeString("");
        } catch (Throwable ignored) {
        }
        try {
            demo.consumeInteger(0);
        } catch (IllegalArgumentException e) {
            if ("integer should not be null".equals(e.getMessage())) return;
            throw e;
        }
    }

    private static void expectSecondCallFallback(Demo demo) {
        try {
            demo.consumeString("");
        } catch (Throwable ignored) {
        }
        demo.consumeInteger(0);
    }
}
