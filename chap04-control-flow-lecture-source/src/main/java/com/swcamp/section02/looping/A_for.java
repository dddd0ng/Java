package com.swcamp.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {

        /* 설명. 1부터 10까지 출력하는 반복문 작성하기 */
        for(int i = 1;
            i <= 10;
            i++) {
            System.out.println(i + "출력");
        }
    }

    public void testForExample() {

        /* 설명. 5개의 각 변수에 값들에 2를 곱하고 1을 더해 sum에 누적 */
        int num1 = 1;
        int num2 = 3;
        int num3 = 5;
        int num4 = 7;
        int num5 = 9;

        int sum = 0;

        sum += num1 * 2 + 1;
        sum += num2 * 2 + 1;
        sum += num3 * 2 + 1;
        sum += num4 * 2 + 1;
        sum += num5 * 2 + 1;

        System.out.println("sum = " + sum);

        /* 설명. for문을 통해 개선해 보자.(feat. 규칙적이며 반복적인 코드들) */
        int forSum = 0;

        /* 설명. 디버깅 요령: 1. 반드시 되는 시점까지 돌리거나 주석해서 되게 만든다.
         *                 2. 코드를 한번에 많이 완벽하게 하고 실행하면 X
         * */
        for (int i = 0; i < 10; i+=2) {
            System.out.println("i = " + i);
//            forSum += (i + 1) * 2 + 1;
        }

        System.out.println("forSum = " + forSum);
    }

    public void testForExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("반복횟수 입력: ");
        int limit = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += (i + 1);
        }

        System.out.println("sum = " + sum);
    }
}
