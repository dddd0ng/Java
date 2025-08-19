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
    }

    @Override
    public String toString() {
        return "@@@" + this.name() + "@@@";
    }
}
