package com.vova.spring.mvc.hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class MyLoggingAspect {

    @Around("execution (* com.vova.spring.mvc.hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        return null;
    }

}
