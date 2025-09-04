package com.swcamp.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application1 {
    public static void main(String[] args) {
        //스프링 목적=추상화
        /* 설명. ContextConfiguration으로 설정한 내용을 바탕으로 IOC컨테이너 생성*/
        //어노테이션, 자바를 활용해서 컨테이너를 만듦
        ApplicationContext context =
                    new AnnotationConfigApplicationContext(ContextConfiguration.class);
        //나중에 위에꺼도 안쓰고 외부에서 자동으로 생성되는걸 씀

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName: " + beanName);
        //클래스 자체도 bean
        }

    }

}
