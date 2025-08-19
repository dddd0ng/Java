package com.swcamp.Section02.enumtype;

public enum Subject {
    //필드명만 씀
    JAVA,
    MARIADB,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;
 // enum타입에 추가적인 코드가 있을 경우 세미콜론을 빼면 안됨. 없을땐 생략가능


    Subject(){
        System.out.println("기본 생성자 호출 됨......");
        //싱글톤, 1개만 사용해도 6개 다 호출됨, 객체가 생성.
    //상수가 전부 객체, 클래스 로딩 시점에 JVM이 6개의 객체를 한꺼번에 생성하기 때문에 생성자가 6번 호출되느것
        //enum의 각 상수는 사실상 public static final로 미리 만들어진 객체
        //그래서 Subject.JAVA를 딱 하나만 사용해도 이미 클래스 로딩 시점에 6개가 다 만들어져있음
        //생성자는 enum내부에서만 호출 가능, 컴파일러가 상수 개수만큼 자동 호출
        //enum은 싱글톤처럼 보이지 상수 개수만큼 미리 만들어지는 멀티톤 패턴이라 보면 됨

    }

    @Override
    public String toString() {
        return "@@@" + this.name() + "@@@";
    }
}
