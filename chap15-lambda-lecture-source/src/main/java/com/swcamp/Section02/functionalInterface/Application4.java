package com.swcamp.Section02.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Operator에 대해 이해하고 사용할 수 있다. */
        UnaryOperator<String> unaryOperator = str -> "Hello " + str;
        System.out.println(unaryOperator.apply("World!"));

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Nice to ", "meet u!"));
    }
}
