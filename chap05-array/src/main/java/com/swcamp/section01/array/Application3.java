package com.swcamp.section01.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 들어갈 초기 기본값 및 전달인자로써의 배열 자료형 */
        /* 설명.
         *  값의 형태별 기본값
         *  정수: 0
         *  실수: 0.0
         *  논리: false
         *  문자: \u0000, \0
         *  참조: null
         * */

        int[] iArr = new int[5];
        iArr = null;
        System.out.println(iArr);

        /* 설명. 크기 및 원하는 값이 채워진 상태의 배열 바로 만들어보기 */
        int[] iArr2 = {10, 11, 12, 13, 14};
        int[] iArr3 = new int[]{20, 21, 22, 23, 24};

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));

        /* 설명. 다만 new 연산자를 생략해서 안되는 경우가 있다. */
        test(new int[]{10, 11, 12, 13, 14});
//        test({10, 11, 12, 13, 14});             // new 연산자 없이 X

    }

    private static void test(int[] iArr2) {
        System.out.println("메소드에서 넘겨받은 배열 확인: " + Arrays.toString(iArr2));
    }
}