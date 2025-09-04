package com.swcamp.listener.section02.sessionlistener;


import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

public class UserDTO implements HttpSessionBindingListener {
    public UserDTO() {
    }

    private String firstName;
    private int age;

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDTO(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
//
//세션은 사용자 개인 별로기때문에
    /* 설명. HttpSessionBindingListener는 각 class마다 별도로 작성*/
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("UserDTO 객체가 session에 담김");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("UserDTO가 객체가 session에서 제거됨");
    }
}
