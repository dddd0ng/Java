package com.swcamp.section04.constructor;
import java.util.Date;
public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 설명. 기본 생성자(작성하지 않아도 작성됨, 명시적으로 작성하는 걸 권장) */
    public User() {
        System.out.println("기본생성자 실행됨...");
    }

    /* 설명. 매개변수 있는 생성자(객체가 생성될 때 초기화 하고 싶은 값을 매개변수로 가지는 생성자) */
    /* 설명. 생성자에서 this.의 의미는 해당 생성자로 생성 될 객체를 뜻함 */
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public User(String id, String pwd, String name, Date enrollDate) {

        /* 설명. this()는 같은 클래스의 다른 생성자를 참조할 때 사용
         *  1. 첫 줄에 사용할 것
         *  2. 다른 생성자 하나만 추가 사용 가능
         *  (목적은 코드 줄 수 줄이기)
         * */
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
        this(id, pwd, name);
        this.enrollDate = enrollDate;
    }

    public String getInfo() {
        return this.id + ", " + this.pwd + ", " + this.name + ", " + this.enrollDate;
    }
}