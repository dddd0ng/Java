package com.swcamp.Section05.overloading;

public class OverloadingTest {

    /* 설명. 오버로딩(Overloading)에 대해 이해 할 수 있다*/
    /* 메소드의 시그니처
    * public void method(int num){} 이라면, 메소드의 메소드명과 파라미터 선언부 부분을
    * 메소드의 시그니처(signature)라고 한다.(즉 method(int num))
    *
    * 동일한 메소드 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 경우 적응하는 기술을
    * 오버로딩이라고 한다
    *
    * 오버로딩의 조건
    * 매개변수의 타입, 갯수, 순서를 다르게 작성하여 하나의 클래스 내에 동일한 이름의
    * 메소드를 여러개 작성할 수 있다.
    *  */
    public void test(){}

    public void test(int num){}

    public void test(int num1, int num2){}

//    public String test(){} 반환형이 달라도 메소드명+매개변수같으면 메소드명못씀
//    public void test(int num2, int num1){} 매개변수 위치가 달라도 메소드명 못씀
// 매개변수 위치 달라도 자료형 다르면 쓸 수 있음 -> 갯수, 타입, 순서를 따짐
    public void test(int num, String str){}
    public void test(String str, int num){}

}
