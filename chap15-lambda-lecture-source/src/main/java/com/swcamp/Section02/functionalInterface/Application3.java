package com.swcamp.Section02.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 하나인 Function에 대해 이해하고 사용할 수 있다. */
        Function<String, Integer> function = str -> Integer.valueOf(str);
        String str = "12345";
        System.out.println(function.apply(str));
        System.out.println(function.apply(str) instanceof Integer);

        BiFunction<String, String, Integer> biFunction =
                (str1, str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println(biFunction.apply("123", "123"));
    }
}
