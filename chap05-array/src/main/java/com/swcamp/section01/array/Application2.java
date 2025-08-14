package com.swcamp.section01.array;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 사용방법을 익혀 배열을 사용할 수 있다. */
        /* 설명.
         *  배열의 사용방법
         *   1. 배열의 선언
         *   2. 배열의 크기 할당
         *   3. 배열의 인덱스 공간에 값 대입
         * */

        /* 설명. 배열의 선언 및 초기화는 따로 진행할 수 있다. */
        int[] iArr;
        char cArr[];        // []의 위치가 변수명 뒤에 있어도 동작하지만 지양하자.

        iArr = new int[5];
        cArr = new char[5];

        /* 설명. 참조자료형을 출력하면 실제로는 해당 자료형의 toString()이 실행된다. */
        System.out.println("iArr = " + iArr.toString());
        System.out.println("iArr의 10진수 주소: " + iArr.hashCode());
        System.out.println("iArr 배열에 담긴 값: " + Arrays.toString(iArr));

    }
}