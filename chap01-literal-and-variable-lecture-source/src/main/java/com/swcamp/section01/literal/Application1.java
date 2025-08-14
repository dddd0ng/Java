package com.swcamp.section01.literal;

public class Application1 {
}
public class Application1 {
    public static void main(String[] args) {

        // 한 줄 주석(코드 한줄 설명)

        /*
           범위 주석1
           범위 주석2
           (설명이 좀 길 때)
         */

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

        /* 목차. 1-2. 실수 형태의 값 출력 */
        System.out.println(1.234);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');       // 자바는 하나의 문자는 싱글쿼테이션(')으로 작성
        System.out.println('1');
        System.out.println('\u0000');  // 문자가 없을 땐 \u0000

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);
        System.out.println("true");    // 이건 문자열이다.

    }
}