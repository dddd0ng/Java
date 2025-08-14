package com.swcamp.Section06.statickeyword;

public class Application1 {
    public static void main(String[] args) {

        /* 설명. static
        * 프로그램이 실행될 때 정적 메모리 영역(static영역 또는 클래스 영역)에 할당하는 키워드이다.
        * 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
        * 대표적인 예로 싱글톤(singleton) 객체 또는 설정값(DB 연결정보)를 담을 용도로 쓸 수 있다.
        * */

        /* 설명. static키워드에 대해 이해 할 수 있다.*/
        StaticTest st1 = new StaticTest();

        /* 설명. 현재 두 필드가 가지고 있는 값 확인*/
        System.out.println("non-static field: " + st1.getNonStaticCount());
        System.out.println("static field : " + StaticTest.getStaticCount());

        /* 설명. 각 필드 값들을 증가*/
        st1.increaseNonStaticCount();
        StaticTest.increaseStaticCount();

        /* 설명. 두 필드 값 확인*/
        System.out.println("non-static field: " + st1.getNonStaticCount());
        System.out.println("static field : " + StaticTest.getStaticCount());



        /* 설명. 새로운 객체 생성 후 적용*/
        StaticTest st2 = new StaticTest();
        System.out.println("non-static field: " + st2.getNonStaticCount());
        System.out.println("static field : " + StaticTest.getStaticCount());



    }
}
