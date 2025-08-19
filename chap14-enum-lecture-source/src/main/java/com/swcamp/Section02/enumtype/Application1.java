package com.swcamp.Section02.enumtype;

public class Application1 {
    public static void main(String[] args) {
        /* 설명. enum타입은 최초 사용 시 Singleton객체가 주입되어, 같은 값에 대해선 동일비교가 가능*/
        /* 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며, 인스턴스가 각각 1개임을 보장함*/
        /* 작성한 순서에 따라 각각 다른 인스턴스가 생성되어 할당되며 최초 호출 시에 enum의 생성자를*/
        /* 활용해 생성된다.(lazy Singleton개념)*/
        Subject subject1 = Subject.JAVA;
        Subject subject2 = Subject.HTML;
        Subject subject3 = Subject.JAVA;

//        if  (subject1 == subject2) {
        if  (subject1 == subject3){
            System.out.println("두 과목은 같은 과목이다.");
        }else {
            System.out.println("두 과목은 다른 과목이다.");
        }

        /* 설명. 상수 필드명을 문자열로 변경하기 쉽다.*/
        System.out.println(Subject.JAVA.name());
        System.out.println(Subject.HTML.name());
        // toString은 오버라이딩 할 수 있음
        System.out.println(Subject.CSS.toString());
        // 우리가 toString()을 오버라이딩 해서 수정해서 쓸 수 있음

        /* 설명. 상수 필드를 순회하며 연속처리 할 수 있다.*/
        Subject[] subjects = Subject.values();
        for (Subject subject : subjects) {
            System.out.println(subject.toString());
            System.out.println(subject.name());
            System.out.println(subject.ordinal());
            // enum 타입의 상수 필드의 순서를 인덱스 개념으로 활용 할 수 있다.
        }

        /* 설명. 타입 안정성을 보장한다.*/
        printSubject(Subject.JAVA);
//        printSubject(10);         // Subject 타입이 아니면 전달 할 수 없다.

    }

    private static void printSubject(Subject subject) {
    }
}
