package com.swcamp.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//적용하려면 일단 component를 해서 bean으로
@Component
//로그 확인용 aspect
@Aspect
public class LoggingAspect {

    /* 설명. 포인트 컷을 따로 메소드로 빼내는 작업*/
    @Pointcut("execution(*com.swcamp.section01.aop.*Service.*(..))")
    public void logginAspect(){
        //저 위에 있는 포인트컷을 활용하려면 기본메서드로 호출해서 활용
    }

    //@Before("execution(*com.swcamp.section01.aop.*Service.*(..))")
    //저 위에 포인트컷 주소가 여기 들어오게, 아래 방식처럼 쓸 수 있음(클래스명.메소드명)
    @Before("LoggingAspect.logginAspect()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Before Advice 동작");
    }
}
