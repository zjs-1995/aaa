package com.itheima.utils;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 */
public class Logger {

    /**
     * 前置通知
     */
    public  void beforeprintLog(){
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     */
    public  void afterprintLog(){
        System.out.println("后置通知");
    }

    /**
     * 异常通知
     */
    public void afterThrowingPrintLog(){
        System.out.println("异常通知");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(){
        System.out.println("最终通知");
    }

    /**
     * 环绕通知
     */
    public Object aroundPringLog(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();
            System.out.println("环绕通知...前置");
            rtValue = pjp.proceed(args);
            System.out.println("环绕通知...后置");
            return rtValue;
        } catch (Throwable t) {
            System.out.println("环绕通知...异常");
            throw new RuntimeException(t);
        }finally {
            System.out.println("环绕通知...最终");
        }

    }
}
