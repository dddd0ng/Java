package com.swcamp.section04.constructor;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출 할 수 있다. */
        User user1 = new User(); // 기본생성자라고 읽으면 됨
        System.out.println(user1.getInfo());

        //new연산자를 활용해 3개의 매개변수를 호출하는거라 생각하면됨
        User user2 = new User("User01", "pass01", "홍길동");
        System.out.println(user2.getInfo());
    }
}
