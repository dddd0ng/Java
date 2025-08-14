package com.swcamp.Section01.generics;

public class Application1   {
    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic)에 대해 이해할 수 있다. */
        MyGenericTest mgt = new MyGenericTest();      // 구현의 편의성은 좋음
        mgt.setValue("Hello World!");
        mgt.setValue(1);
        mgt.setValue(3.14);
        mgt.setValue(new java.util.Date());

        boolean isTrue = (boolean)mgt.getValue();     // 타입 안정성이 좋지 않음

//        GenericTest<Double> gt1 = new GenericTest<Double>();
        GenericTest<Double> gt1 = new GenericTest<>();          // 생성자 쪽은 다이아몬드 연산자만 주로 작성
        GenericTest<String> gt2 = new GenericTest<String>();
//        int test = gt1.getValue();                  // 타입 안정성이 좋음

        /* 설명.
         *  1. 제네릭 클래스는 다양한 자료형으로 변할 수 있어 클래스 하나만으로 활용가치가 높아진다.(구현의 편의성)
         *  2. 매개변수나 반환형도 제네릭 타입으로 지정되어 명확히 해당 타입에 대해 처리할 수 있다.(타입의 안정성)
         * */
    }
}
