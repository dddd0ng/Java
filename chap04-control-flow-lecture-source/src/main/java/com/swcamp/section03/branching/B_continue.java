package com.swcamp.section03.branching;

public class B_continue {
    public static void testSimpleContinueStatement() {

        /* 설명. 1부터 100까지 증가하면서 4와 5의 공배수일 경우 출력해 보기 */
        for (int i = 1; i <= 100; i++) {
            if (!(i % 4 == 0 && i % 5 == 0)) continue;
            System.out.println("현재 " + i + "의 값은 4와 5의 공배수입니다.");
        }
    }
}