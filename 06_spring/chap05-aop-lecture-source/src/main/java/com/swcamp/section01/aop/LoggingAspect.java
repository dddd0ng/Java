package com.swcamp.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;


//적용하려면 일단 component를 해서 bean으로
@Component
//로그 확인용 aspect
@Aspect
public class LoggingAspect {

    /* 설명. 포인트 컷을 따로 메소드로 빼내는 작업*/
    @Pointcut("execution(* com.swcamp.section01.aop.*Service.*(..))")
//* = all,      *Service(도메인과 상관없이 모든 서비스 계층),  .* 메소드
    public void logginAspect() {
        //저 위에 있는 포인트컷을 활용하려면 기본메서드로 호출해서 활용
    }

    /* 설명. Before Advice*/
    //@Before("execution(*com.swcamp.section01.aop.*Service.*(..))")
    //저 위에 포인트컷 주소가 여기 들어오게, 아래 방식처럼 쓸 수 있음(클래스명.메소드명)
    @Before("LoggingAspect.logginAspect()")
    public void logBefore(JoinPoint joinPoint) { //<조인포인트의 개념은 어드바이스의 후보
        // 실제로 런타임 시점에 어드바이스가 적용될 대상이 넘어오는것
        System.out.println("Before Advice 동작");
        System.out.println("Before joinPoint.getTarget() : " + joinPoint.getTarget());
        System.out.println("Before joinPoint.getSignature(): " + joinPoint.getSignature());
        if (joinPoint.getArgs().length > 0) {            //매개변수가 있다면
            System.out.println("Before joinPoint.getArgs()[0]: " + joinPoint.getArgs()[0]);
        }
    }


    /* 설명. After Advice*/
    @After("LoggingAspect.logginAspect()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After Advice 동작");
        System.out.println("After joinPoint.getTarget() : " + joinPoint.getTarget());
        System.out.println("After joinPoint.Signature() : " + joinPoint.getSignature());
        if (joinPoint.getArgs().length > 0) {            //매개변수가 있다면
            System.out.println("After joinPoint.getArgs()[0]: " + joinPoint.getArgs()[0]);

        }
    }

    /* 설명. AfterReturning Advice*/
    @AfterReturning(pointcut = "logginAspect()", returning="result")//속성 2개 써야함
    //pointcut은 같은 클래스의 메소드면 클래스명 생략 가능
    public void logAfterReturning(JoinPoint joinPoint, Object result){ //returning="값", Object "값" 같아야함
        System.out.println("After Returning result : "+result);

        if(result != null && result instanceof List) {
            ((List<MemberDTO>)result).add(new MemberDTO(3L,"반환 값 가공"));
       //after보다 조금 더 앞에서 동작 -> afterReturning
        }
    }
}
