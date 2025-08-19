package com.swcamp.Section03.grammer;

import java.util.EnumSet;

public class Application1 {
    public static void main(String[] args) {
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin.name());
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.ordinal()+ ", " + consumer.name() + ", " + consumer.getDESCRIPTION());


        /* 설명. Set의 개념을 활용 할 수도 있다. (feat.iterator)*/
        System.out.println("Set으로 바꿔 활용하기");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);

    }
}
