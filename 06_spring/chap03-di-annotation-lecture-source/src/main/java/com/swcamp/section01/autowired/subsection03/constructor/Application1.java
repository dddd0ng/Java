package com.swcamp.section01.autowired.subsection03.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
public class Application1 {
    //컨테이너 만드는 코드, " "내에 적힌 범위 내에있는애들 스캔
    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.swcamp.section01");

    //        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    //이름,타입 지정 정하고 꺼내기(명시적)
    //
    com.swcamp.section01.autowired.subsection02.setter.BookService bookService = context.getBean("setterService", BookService.class);
        System.out.println("bookService = " + bookService);

        bookService.findAllBook().forEach(System.out::println);

        System.out.println("1번 책: " + bookService.findBookBySequenceOf(1));
    //.class은 뒤에 꼭 붙여야함

}
}
