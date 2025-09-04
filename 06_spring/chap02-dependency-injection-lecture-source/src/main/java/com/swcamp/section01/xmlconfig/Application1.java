package com.swcamp.section01.xmlconfig;

import com.swcamp.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.Member;

public class Application1 {
//    public static void main(String[] args) {
//        ApplicationContext context =
//                new GenericXmlApplicationContext(
//                        "section01/xmlconfig/spring-context.xml" );
////bean설정을 위에 주소로 할것임
////순수하게 xml로 했다가 java로도 활용 해보기
//
//        /* 설명. new MemberDTO(1,"홍길동","010-123-1234","hong@gmail.com, new PersonalAccount(20, "110,234,4567890)*/"*/
//        Member member = context.getBean("member", Member.class);
//        System.out.println("Member: " + member);

//    }
public static void main(String[] args) {
    ApplicationContext context =
            new GenericXmlApplicationContext(
                    "section01/xmlconfig/spring-context.xml");

    /* 설명. new MemberDTO(1, "홍길동", "010-123-1234", "hong@gmail.com", new PersonalAccount(20, "110-234-4567890", 0)); */
    MemberDTO member = context.getBean(MemberDTO.class);
    System.out.println("member = " + member);
}
}
