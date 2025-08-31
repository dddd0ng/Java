package com.swcamp.Section02.abstractclass;

public class Application1 {
    public static void main(String[] args) {
        Phone smartPhone = new Phone();

        /* 설명. 객체를 생성 할 수 없는 불완전한 클래스로써의 추상클래스*/
//        Product product = new Product(); // 추상클래스가 되면 생성자를 통한 객체를 생성 할 수 없다.

        smartPhone.abstractMethod();   //추상메소드를 물려받아 오버라이딩 한 메소드
        smartPhone.nonStaticMethod();
        smartPhone.staticMethod();
        Product.staticMethod();

        Product p = new Phone() ; // 다형성
        p.abstractMethod();
        p.nonStaticMethod();
    }
}
//불완전한 메소드=규약
