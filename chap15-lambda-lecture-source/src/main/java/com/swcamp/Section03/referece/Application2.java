package com.swcamp.Section03.referece;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 기존에 존재하는 생성자를 참조한 람다식을 작성할 수 있다. */
        Function<String, Member> member =
//                (String x) -> { return new Member(x); };
                x -> new Member(x);
        System.out.println(member.apply("m01"));

        Function<String, Member> member2 = Member::new;
        System.out.println(member2.apply("m02"));
    }
}
