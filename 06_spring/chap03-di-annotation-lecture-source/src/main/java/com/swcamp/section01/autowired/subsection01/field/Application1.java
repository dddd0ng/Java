package com.swcamp.section01.autowired.subsection01.field;

import com.swcamp.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.swcamp.section01");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        BookService bookService = context.getBean(BookService.class);

        /* 설명. 1. 도서 전체 조회 */
        /* 설명. 도서 전체 조회 후 List<BookDTO>가 돌아올 것을 상정 */
        List<BookDTO> bookList = bookService.findAllBook();
//        bookList.stream().forEach(book -> System.out.println(book));
        bookList.forEach(book -> System.out.println(book));  // forEach 시에는 stream() 생략 가능
        // (feat. 컬렉션일 시)

        /* 설명. 2. 도서 번호로 한 권 조회 */
        System.out.println("1번 책: " + bookService.findBookBySequence(1));
        System.out.println("2번 책: " + bookService.findBookBySequence(2));
    }
}