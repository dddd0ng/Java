package com.swcamp.section02.javaconfig;

import com.swcamp.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext context=
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean(MemberDTO.class);
        System.out.println("member = " + member);

    }
}
