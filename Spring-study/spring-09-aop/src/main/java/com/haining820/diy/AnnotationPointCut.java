package com.haining820.diy;

//方式三:使用注解实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component
@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.haining820.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==============方法执行前===============");
    }

    @After("execution(* com.haining820.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("==============方法执行后===============");
    }

    //在环绕增强中,我们可以给定一个参数,代表我们要获取处理切入的点
    @Around("execution(* com.haining820.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("=========环绕前==========");
        Object proceed = jp.proceed();  // 执行方法
        System.out.println("=========环绕后==========");

        Signature signature = jp.getSignature();  // 获得签名
        System.out.println("signature: "+signature);
        System.out.println(proceed);
    }
    /**
     * =========环绕前==========
     * ==============方法执行前===============
     * 删除了一个用户
     * =========环绕后==========
     * signaturevoid com.haining820.service.UserService.delete()
     * null
     * ==============方法执行后===============
     */
}

