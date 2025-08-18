package com.swcamp.Section01.list.run;

import com.swcamp.Section01.list.comparato.DescendingAuthor;
import com.swcamp.Section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부",35000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));


        System.out.println("=====정렬 전=====");
//        System.out.println("bookList = " + bookList);

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
/* 설명. Comparable 인터페이스를 구현한 해당 클래스 기준 정렬 외에도 Comparator를 구현한 별도의 정렬 기준도 가능*/
//       List계열도 sort 메소드를 사용 할 수 있으며, Comparator를 구현한 인스턴스 여부만 판단하면 된다.
//        Collections.sort(bookList); // BookDTO implements comparable
//        bookList.sort(null); // 위와 동일함
        Collections.sort(bookList, new DescendingAuthor());
//        bookList.sort(new DescendingAuthor()); // 위와 동일함


        System.out.println("=====정렬 후======");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

    }
}
