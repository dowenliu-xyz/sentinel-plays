package org.example.eff.fallback.interfaces.jdk.biz;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.springframework.aop.support.AopUtils;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;

public final class Run {
    private Run() {
        throw new UnsupportedOperationException("Cannot instantiate utility class.");
    }

    @NotNull
    public static String detectProxyType(ApplicationContext applicationContext, String caseId) {
        String jjProxyType = detectBeanProxyType(applicationContext, "case" + caseId + "JavaInterfaceJavaDemo");
        String jkProxyType = detectBeanProxyType(applicationContext, "case" + caseId + "JavaInterfaceKotlinDemo");
        String kjProxyType = detectBeanProxyType(applicationContext, "case" + caseId + "KotlinInterfaceJavaDemo");
        String kkProxyType = detectBeanProxyType(applicationContext, "case" + caseId + "KotlinInterfaceKotlinDemo");
        if (jjProxyType.equals(jkProxyType) && jkProxyType.equals(kjProxyType) && kjProxyType.equals(kkProxyType)) {
            return jjProxyType;
        }
        throw new IllegalStateException("case proxyType not match");
    }

    @NotNull
    private static String detectBeanProxyType(ApplicationContext applicationContext, String beanName) {
        Object bean = applicationContext.getBean(beanName);
        if (!AopUtils.isAopProxy(bean)) {
            return "None";
        }
        if (AopUtils.isCglibProxy(bean)) {
            return "Cglib";
        }
        if (AopUtils.isJdkDynamicProxy(bean)) {
            return "JdkDynamic";
        }
        return "Unknown";
    }

    @NotNull
    public static String detectEffectiveness(ApplicationContext applicationContext, String caseId) {
        String jjResult = detectBeanEffectiveness(applicationContext, "case" + caseId + "JavaInterfaceJavaDemo");
        String jkResult = detectBeanEffectiveness(applicationContext, "case" + caseId + "JavaInterfaceKotlinDemo");
        String kjResult = detectBeanEffectiveness(applicationContext, "case" + caseId + "KotlinInterfaceJavaDemo");
        String kkResult = detectBeanEffectiveness(applicationContext, "case" + caseId + "KotlinInterfaceKotlinDemo");
        if (jjResult.equals(jkResult) && jkResult.equals(kjResult) && kjResult.equals(kkResult)) {
            return jjResult;
        }
        throw new IllegalStateException("case effectiveness not match");
    }

    @NotNull
    private static String detectBeanEffectiveness(ApplicationContext applicationContext, String beanName) {
        Object bean = applicationContext.getBean(beanName);
        EffAnno effAnno;
        HandlerLocation handlerLocation;
        try {
            Method greeting = bean.getClass().getMethod("greeting", String.class);
            try {
                String result = (String) greeting.invoke(bean, "");
                String[] split = result.split(":");
                effAnno = EffAnno.valueOf(split[0]);
                handlerLocation = HandlerLocation.valueOf(split[1]);
                if (!"fallback without error".equals(split[2])) {
                    throw new AssertionError("unexpected fallback");
                }
            } catch (InvocationTargetException ite) {
                Throwable cause = ite.getCause();
                if (cause instanceof UndeclaredThrowableException) {
                    throw cause.getCause();
                }
                if (cause instanceof IllegalStateException && "Cannot resolve target method: greeting".equals(cause.getMessage())) {
                    return "SomeOne,None,CannotResolveOriginMethod";
                }
                throw cause;
            }
        } catch (BizException e) {
            handlerLocation = HandlerLocation.None;
            boolean cut = Arrays.stream(e.getStackTrace())
                    .anyMatch(ste -> ste.getClassName().contains("SentinelResourceAspect"));
            if (cut) {
                effAnno = EffAnno.SomeOne;
            } else {
                effAnno = EffAnno.None;
            }
        } catch (BlockException e) {
            handlerLocation = HandlerLocation.None;
            effAnno = EffAnno.SomeOne;
        } catch (Throwable t) {
            throw new AssertionError("unexpected exception", t);
        }
        return effAnno + "," + handlerLocation + ",";
    }
}
