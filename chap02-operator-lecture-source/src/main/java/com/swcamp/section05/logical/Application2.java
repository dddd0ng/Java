package com.swcamp.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 논리 연산자를 활용할 수 있다. */
        /* 목차. 1. 1부터 100 사이 값인지 확인 */
        int num1 = 55;
        int num2 = 101;
        System.out.println(num1 >= 1 && num1 <= 100);
        System.out.println(num2 >= 1 && num2 <= 100);

        /* 목차. 2. 영어 대문자인지 확인 */
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println(ch1 >= 'A' && ch1 <= 'Z');
        System.out.println(ch2 >= 'A' && ch2 <= 'Z');
        System.out.println((int)'Z');

        /* 목차. 3. 대소문자 상관없이 'y'인지 확인 */
        char ch3 = 'y';
        char ch4 = 'Y';
        System.out.println("y를 입력했는지 확인: " + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("y를 입력했는지 확인: " + (ch4 == 'y' || ch4 == 'Y'));
    }
}