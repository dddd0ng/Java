package com.swcamp.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */
        System.out.println("====== 정수와 정수의 연산 ======");
        System.out.println(123 + 456);  // ctrl + d
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(123 / 456);
        System.out.println(123 % 456);

        System.out.println("====== 실수와 실수의 연산 ======");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);   // 실수는 정확하지 않고 근사한 값이다.

        System.out.println("====== 정수와 실수의 연산(실수) ======");
        System.out.println(123 / 5.0);    // 소수점을 살리고 싶다면 최소 하나는 실수여야 함

        System.out.println("====== 문자와 정수의 연산(정수) ======");
        System.out.println('a' + 1);
        System.out.println((char)('a' + 1));  // 문자로 다시 바꿀 수도 있다(이후 배움)
        System.out.println('a' % 2);

        System.out.println("====== 문자열과 문자열의 연산 ======");
        System.out.println("Hello" + " World!~");
//        System.out.println("Hello" - " World!~");

        System.out.println("====== 문자열과 다른 형태의 값 연산 ======");
        System.out.println("hello" + 123);   // "hello" + "123"
        System.out.println("hello" + true);
        System.out.println(123 + 1 + "hello " + 123.0 + 2);
        System.out.println(123 + 1 + "hello " + (123.0 + 2));
    }
}