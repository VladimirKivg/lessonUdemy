package com.vova.spring.mvc.hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org. springframework.stereotype.Component;

@Component
@Aspect
public class     MyLoggingAspect {

    @Around("execution   (* com.vova.spring.mvc.hibernate_aop.dao.*.*(..))")
    public Object   aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodMame =  methodSignature.getName();
        System.out.println("begin OF " + methodMame);

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("End of" +  methodMame);

        return targetMethodResult;
    }

}
