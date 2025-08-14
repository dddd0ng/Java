package com.swcamp.Section02.abstractclass;

/* 설명. 0개 이상의 추상메소드가 있을 때 추상클래스가 될 수 있다 (추상메소드가 1개 이상 일 시 필수)*/
public abstract class Product {

    private int nonStaticField;
    private static int staticField;

    /* 설명. 자식 타입의 객체를 위해서는 쓰이는 생성자 */
    public Product() {
    }

    public void nonStaticMethod(){}
    public static void staticMethod(){}

/* 설명. 추상메소드(메소드의 바디(body)부가 없음, abstract라는 키워드 사용, 불완전한 메소드라고 함*/
    public abstract void abstractMethod();
}
