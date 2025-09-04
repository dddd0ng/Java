package com.swcamp.section02.xmlconfig;

//resources에 xml
//스프링 전역에 설정 하는 느낌 (컨텍스트=도메인과 같이 광범위하게 쓰임)

import com.swcamp.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application1 {
    //컨테이너 만들기
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("section02/xmlconfig/spring-context.xml");
//자바가 아닌 우리가 집적 만든것만~!~


        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName: beanNames) {
            System.out.println("beanName = " + beanName);
        }

        /* 설명. 스프링의 IOC Container에서 관리중인 bean을 따로 추출 해보자! */
        /* 설명. 1. bean의 이름(id)을 가지고 컨테이너에서 추출 */
        MemberDTO member = (MemberDTO)context.getBean("member2");
        System.out.println("첫 번째 member: " + member);

        /* 설명. 2. bean의 클래스의 메타 정보(bean의 타입)을 전달하며 추출 */
        MemberDTO member2 = context.getBean(MemberDTO.class);
        System.out.println("두 번째 member: " + member2);

        /* 설명. 3. bean의 id와 클래스의 메타 정보를 전달하며 추출 */
        MemberDTO member3 = context.getBean("member2", MemberDTO.class);
        System.out.println("세 번째 member: " + member3);
    }

    }


