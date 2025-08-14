package com.swcamp.section01.method;

public class Application3 {

    /* 설명. 전역변수(메소드들에서 쓸 수 있는 변수) */
    static int global = 10;

    public static void main(String[] args) {

        /* 수업목표. 메소드 전달인자(argument)와 매개변수(parameter)에 대해 이해하고 활용할 수 있다. */
        /* 설명.
         *  변수를 선언한 위치에 따라 변수는 구별해서 부를 수 있다.
         *  1. 지역변수
         *  2. 전역변수
         *  3. 매개변수
         *  4. 클래스 변수 (추후 다룰 예정)
         *  5. 인스턴스 변수 (추후 다룰 예정)
         * */
        System.out.println("전역 변수: " + global);

        int local = 20;
        System.out.println("지역 변수: " + local);

        int age = 7;

        Application3 app = new Application3();
        app.testMethod(age);
        app.testMethod(19);
        app.testMethod(27);
    }

    /* 설명. int age는 매개변수이자 지역변수 */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}