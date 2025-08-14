package com.swcamp.section03.constant;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 상수에 대해 이해하고 사용할 수 있다. */
        int age;
        final int AGE;     // final 키워드와 함께 대문자 변수명 작성

        age = 2;
        age = 3;

        AGE = 2;        // 초기화
//        AGE = 3;        // 초기화 이후에는 대입 불가능

        final double PI = 3.1415;   // 선언과 동시에 초기화를 권장

        /* 필기. 상수는 프로그램에서 오염되는 안되는 고정해서 쓸 값을 저장할 용도 */
    }
}
