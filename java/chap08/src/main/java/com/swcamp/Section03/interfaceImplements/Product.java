package com.swcamp.Section03.interfaceImplements;

//클래스->기본생성자 생략해도 있음->객체가될수있음
public class Product implements InterProduct{
    @Override
    public void nonStaticMethod(int num) {
        System.out.println("넘어온 값은 "+ num + "입니다.");

    }

    @Override
    public void nonStaticMethod2() {

    }
    @Override
    public void plusItems(String itemName, int num) {

    }
}
