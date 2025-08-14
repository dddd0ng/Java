package com.swcamp.section03.overriding;

public class SuperClass {

    /* 설명. 오버라이딩에 대해 이해할 수 있다.*/
    /* 설명. 멤버(필드+메소드) + 생성자에는 public / protected / default / private 4종류가 있다.*/
    public void method(int num){}

    public Object method2(int num){
        return null;

    }

    private void privateMethod(){}
    public final void finalMethod(){} // 접근제어자,반환형 사이에 final, static 사용가능, final,static은 순서 상관없음
}
