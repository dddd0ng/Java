package com.swcamp.section04.comparison;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 비교연산자에 대해 이해하고 활용할 수 있다. */
        /* 목차. 1. 숫자값 비교 */
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 < num2);
        System.out.println('a' > num1);

        /* 목차. 2. 논리값 비교 */
        boolean isTrue1 = true;
        boolean isTrue2 = false;
        System.out.println(isTrue1 == isTrue2);
        System.out.println(isTrue1 != isTrue2);
//        System.out.println(isTrue1 >= isTrue2);
//        System.out.println(isTrue1 > isTrue2);
//        System.out.println(isTrue1 <= isTrue2);
//        System.out.println(isTrue1 < isTrue2);

        /* 목차. 3. 문자열값 비교 */
        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
//        System.out.println(str1 >= str2);
//        System.out.println(str1 > str2);
//        System.out.println(str1 <= str2);
//        System.out.println(str1 < str2);
    }
}