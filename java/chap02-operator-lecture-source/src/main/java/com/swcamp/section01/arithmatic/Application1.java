package com.swcamp.section01.arithmatic;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 산술연산자에 대해 이해하고 활용할 수 있다. */
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));

        double testNum = num1 / (double)num2;
        System.out.println("testNum = " + testNum);

        /* 설명. 소수점 셋째자리에서 버림 처리해서 소수점 이하 두자리까지 표현해 보기 */
        double testNum2 = (int)(testNum * 100) / (double)100;
        System.out.println("testNum2 = " + testNum2);

        System.out.println("num1 % num2 = " + (num1 % num2));
    }
}