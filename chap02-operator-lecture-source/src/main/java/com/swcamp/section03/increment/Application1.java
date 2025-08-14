package com.swcamp.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 단항 연산자이자 증감연산자에 대해 이해하고 활용할 수 있다. */
        int num = 20;
        System.out.println("num = " + num);

        num++;        // 후위 연산자
        System.out.println("num = " + num);

        ++num;        // 전위 연산자
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        int firstNum = 20;
        int result = firstNum++ + 3;
        System.out.println("result = " + result);           // 23
        System.out.println("firstNum = " + firstNum);       // 21
        System.out.println("firstNum++ = " + firstNum++);   // 21
        System.out.println("firstNum = " + firstNum);       // 22

        /* 설명. a, b, c, d 값 맞추기 */
        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b;
        b = 2 * (-c + a++) - d;
        c *= 2;
        a = b++ + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        /* 설명. 커피 취득자
         *  1. 이지윤
         *  2. 이승건
         *  3. 강지륜
         *  4. 강지현
         *  5. 변민철
         * */

    }
}