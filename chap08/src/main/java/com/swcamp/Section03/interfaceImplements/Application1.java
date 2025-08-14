package com.swcamp.Section03.interfaceImplements;

public class Application1 {
    public static void main(String[] args) {
    Product product = new Product();
    product.nonStaticMethod(3);

    /* 설명. 추상클래스와 마찬가지로 생성자를 활용한 객체 생성x(생성자 자체가 x)*/
//    InterProduct i = new InterProduct();
        InterProduct inter = new Product();
        inter.nonStaticMethod(2);



    InterProduct inter = new Product();
    inter.nonStaticMethod(7);
    }
}
