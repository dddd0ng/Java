package com.swcamp.section03.annotationconfig.subsection01.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);
        // 클래스의 타입만 뜯어서 던지려면 위에 코드처럼 // ContextConfiguration만 던지면 x .class해줘야함
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);

    }
}

//어노테이션이 돼있어도 무조건 나오는게 아니라 인지범위 안에 있어야함
//ContextConfiguration.class 같은 패키지 내에있는애만 쳐다보는중이라 시야 넓혀줘야함
/* Configuration패키지 가서
@ComponentScan(basePackages = "com.swcamp")//하위 패키지에 있는 파일들 스캔 (@Component 붙은거)
 */
