package com.swcamp.section04.dto;

public class Application1 {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO();
//        System.out.println(user1.toString());
        System.out.println(user1);
        UserDTO user2 = new UserDTO("user01","pass01","홍길동",new java.util.Date());
        System.out.println("user2 = " + user2);

        
        /* 설명. JSP, Spring Framework, Mybatis,...등에서 사용할 예정*/
        user2.setName("유관순");
        System.out.println("user2 = " + user2.getName());
    }
}