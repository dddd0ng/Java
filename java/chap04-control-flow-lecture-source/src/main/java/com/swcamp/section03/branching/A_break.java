package com.swcamp.section03.branching;

public class A_break {
    public static void testSimpleBreakStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                System.out.println();
                if (j == 3) break;      // 조건문 또는 반복문의 실행 구문이 한 문장이면 {}생략 가능
                // 자신이 소속된 가장 안쪽 반복문만 빠져나감
            }
        }
    }
}