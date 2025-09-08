package com.swcamp.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

//AOP
//적용하려면 일단 component를 해서 bean으로
@Component
//로그 확인용 aspect
@Aspect
public class LoggingAspect {

    /* 설명.
     *  타겟 클래스의 메소드에서 어드바이스를 적용할 수 있는 지점들을 조인포인트(joinpoint)라고 한다.
     *  포인트컷(pointcut)은 여러 조인포인트들에 어드바이스(advice)를 적용할 곳을 지정한 것이다
     *  해당 조인포인트에서 어드바이스가 동작한다.
     *
     * 설명.
     *  <포인트컷 표현식>
     *  execution([수식어] 리턴타입 [클래스이름].이름(파라미터))
     *  1. 수식어: public, private 등 수식어를 명시(생략 가능)
     *  2. 리턴 타입: 리턴 타입을 명시
     *  3. 클래스 이름(패키지명 포함) 및 메소드 이름: 클래스이름과 메소드 이름을 명시
     *  4. 파라미터(매개변수): 메소드의 파라미터를 명시
     *  5. " * ": 1개이면서 모든 값이 올 수 있음
     *  6. " .. ": 0개 이상의 모든 값이 올 수 있음
     *
     * 설명.
     *  ex)
     *   execution(public Integer com.swcamp.section01.advice.*.*(*))
     *   => com.swcamp.section01.advice 패키지에 속해 있는 바로 다음 하위 클래스에 파라미터가 1개인 모든 메소드
     *      이자 접근 제어자가 public이고 반환형이 Integer인 경우
     *   execution(* com.swcamp.section01.advice.annotation..stu*(..))
     *   => com.swcamp.section01.advice 패키지 및 하위 패키지에 속해 있고 이름이 stu로 시작하는 파라미터가 0개
     *      이상인 모든 메소드이며 접근제어자와 반환형은 상관 없음
     *
     * */


    /* 설명. 포인트 컷을 따로 메소드로 빼내는 작업*/
    @Pointcut("execution(* com.swcamp.section01.aop.*Service.*(..))")
//* = all,      *Service(도메인과 상관없이 모든 서비스 계층),  .* 메소드
    public void loggingAspect() {
        //저 위에 있는 포인트컷을 활용하려면 기본메서드로 호출해서 활용
    }

    /* 설명. Before Advice*/
    //@Before("execution(*com.swcamp.section01.aop.*Service.*(..))")
    //저 위에 포인트컷 주소가 여기 들어오게, 아래 방식처럼 쓸 수 있음(클래스명.메소드명)
    @Before("LoggingAspect.loggingAspect()")
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
    @After("LoggingAspect.loggingAspect()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After Advice 동작");
        System.out.println("After joinPoint.getTarget() : " + joinPoint.getTarget());
        System.out.println("After joinPoint.Signature() : " + joinPoint.getSignature());
        if (joinPoint.getArgs().length > 0) {            //매개변수가 있다면
            System.out.println("After joinPoint.getArgs()[0]: " + joinPoint.getArgs()[0]);

        }
    }

    /* 설명. AfterReturning Advice*/
    @AfterReturning(pointcut = "loggingAspect()", returning="result")//속성 2개 써야함
    //pointcut은 같은 클래스의 메소드면 클래스명 생략 가능
    public void logAfterReturning(JoinPoint joinPoint, Object result){ //returning="값", Object "값" 같아야함
        System.out.println("After Returning result : "+result);

        if(result != null && result instanceof List) {
            ((List<MemberDTO>)result).add(new MemberDTO(3L,"반환 값 가공"));
       //after보다 조금 더 앞에서 동작 -> afterReturning
        }
    }

    /* 설명. AfterThrowing Advice*/
    @AfterThrowing(pointcut = "loggingAspect()", throwing = "exception")
    public void logAfterThrowing(Throwable exception){ //throwing="값"=Throwable"값"
        System.out.println("After Throwing Exception : "+exception);
    }

    /* 설명. Around Advice*/
    // 이 어드바이스는 타겟 메소드를 완전히 장악하기 때문에 앞서 살펴 본
    //어드바이스 모두 Around Advice하나로 대체가 가능하다.
    //타겟 메소드를 언제 실행할지, 아니면 아예 실행을 안할 지 여부도 제어한다.
    //(필터와 유사한 부분), 하지만 타겟 메소드를 실행하는 proceed() 메소드를
    //잊는 경우가 자주 발생하기 때문에 사용 시 주의해야 하며,
    //가능한 최소한의 요건을 충족하면서도 가장 약한 어드바이스를 쓰는 것이 바람직하다.

    @Around("loggingAspect()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable { //얘는 반환형이 있음
        System.out.println("Around Before");
        //전 후 처리를 이 before, after사이에 다 작성 할 수 있음
        Object result = joinPoint.proceed(); //throws Throwable을 던짐

        System.out.println("Around After");
        return result;
    }


}
