package com.swcamp.Section01.object.run;

import com.swcamp.Section01.object.dto.BookDTO;

public class Application1 {
    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();
        System.out.println(bookDTO);

        BookDTO book1 = new BookDTO(1,"홍길동전","허균",50000);
        BookDTO book2 = new BookDTO(2,"홍길동전","허균",50000);
        //동등=중복
        /* 설명. Object로부터 물려받은 equals()메소드는 동일비교로 작성되어있다.*/
        System.out.println("두 인스턴스를 == 연산자로 비교 : "+(book1==book2));
        System.out.println("두 인스턴스를 equals( )메소드로 비교 : " +book1.equals(book2));

        
        /* 설명. hashCode()는 객체마다 다른 것이 아니게 됨*/
        System.out.println("book1의 hashCode() : "+ book1.hashCode());
        System.out.println("book2의 hashCode() : "+ book2.hashCode());

        System.out.println(System.identityHashCode(book1));
        System.out.println(System.identityHashCode(book2));

        /* 설명. 동등비교를 위한 equals()로 재정의 하고 싶다.*/
        /* 동등 비교는 객체들이 가진 필드에서 우리가 선택한 기준의 필드 값이 같으면 true가 나오도록
        * equals() 메소드를 오버라이딩 해서 비교하는 것을 말한다.
        * 기본적으로는 equals()만 써도 되지만 이후 String 또는 Collection을 배우면 자바에서
        * 내부적으로 equals()와 hashCode()를 동작시키게 되므로 웬만해선 같이 오버라이딩 해야한다.
        * (hashCode()로 같은 int값이 나오며 equals()가 true이면 동등한 것으로 판단)
        * 동등의 의미는 추 후 중복의 의미와 유사
        * */
    }
}
