package com.swcamp.Section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */
        int intValue = 20;

        /* 설명. 기본 자료형을 Wrapper 클래스 자료형으로 변환할 수 있다.(boxing) */
        Integer boxing = Integer.valueOf(intValue);
        Integer autoBoxing = intValue;                  // auto-boxing

        anythingMethod(intValue);

        /* 설명. Wrapper 클래스의 객체 주소값 확인 */
        Integer integerTest = 30;
        Integer integerTest2 = 30;
        System.out.println("== 비교: " + (integerTest == integerTest2));
        System.out.println("equals() 비교: " + integerTest.equals(integerTest2));
        System.out.println("integerTest 주소: " + System.identityHashCode(integerTest2));
    }

    private static void anythingMethod(Object obj) {

        /* 설명. int -> Integer(오토박싱) -> Object(다형성) */
        /* 설명. Object의 toString() -> Integer의 toString()(동적 바인딩) */
        System.out.println("obj: " + obj.toString());
    }
}
