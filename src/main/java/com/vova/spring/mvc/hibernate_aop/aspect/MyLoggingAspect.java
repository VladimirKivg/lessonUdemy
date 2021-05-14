package com.vova.spring.mvc.hibernate_aop.aspect;

import org.aspectj.lang.annotation.Around;

public class MyLoggingAspect {

    @Around("execution (* com.vova.spring.mvc.hibernate_aop)")
    public Object aroundAllRepositoryMethodsAdvice (){

        return null;
    }

}
