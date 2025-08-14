package com.swcamp.Section03.interfaceImplements;

public interface InterProduct {
    /* 설명. 상수 필드 (feat.public static final)*/

    public static final int MAX_NUM = 100;
    int MIN_NUM = 1; //public static final 생략가능
    // final 값이 들어가면 초기화만x, 값 넣어줘야함
    // int MIN_NUM <= 에러뜸 (final 숨어있음)
    // public static final int MAX_NUM  <= 에러뜸, 초기화 값 넣어줘야함

    /* 설명. 인터페이스는 생성자를 가지지 않는다.*/

    /* 설명. 추상메소드(feat.public abstract)*/
    //int num매개변수 <= 규약, Product 클래스에서 오버라이드 했을때도 int num
    public abstract void nonStaticMethod(int num);
    void nonStaticMethod2();

    void plusItems(String itemName, int num);
}
