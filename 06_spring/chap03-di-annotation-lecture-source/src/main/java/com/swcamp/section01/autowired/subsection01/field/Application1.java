package com.swcamp.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.swcamp.section01");
//이 범위 안에 콩이 될 애들을 @컴포넌트 하면됨
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
