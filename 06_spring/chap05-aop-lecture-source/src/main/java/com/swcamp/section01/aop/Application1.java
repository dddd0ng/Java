package com.swcamp.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//전체 회원 조회, 회원 번호 조회

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        System.out.println("======회원 전체 조회======");
        MemberService memberService = context.getBean("memberService", MemberService.class);
        memberService.findAllMembers().forEach(System.out::println);


        System.out.println("======회원 한명 조회=======");
        System.out.println(memberService.findMemberBy(1));

        //AfterThrowing Advice 확인용 요청
//        System.out.println(memberService.findMemberBy(2));
        //after returning 시 추가된 MemberDTO객체가 있어서 3으로 테스트(3으로 테스트 안돼서 2로 해봄, .add?복붙해보기)

    }



}
