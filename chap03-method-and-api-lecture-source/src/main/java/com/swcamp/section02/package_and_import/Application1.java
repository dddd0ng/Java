package com.swcamp.section02.package_and_import;

import com.swcamp.section01.method.Calculator;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다. */
        /* 설명.
         *  패키지의 의미
         *  1. 클래스의 소속
         *  2. 원래는 클래스명의 일부분
         *  3. 경우에 따라 생략 가능
         * */
        com.swcamp.section01.method.Calculator cal =
                new com.swcamp.section01.method.Calculator();

        /* 설명. import를 활용하면 다른 패키지의 클래스도 줄여쓸 수 있다. */
        Calculator cal2 = new Calculator();

        System.out.println("cal의 합계: " + cal.plusTwoNumbers(100, 10));
        System.out.println("cal2의 합계: " + cal2.plusTwoNumbers(100, 10));
    }
}