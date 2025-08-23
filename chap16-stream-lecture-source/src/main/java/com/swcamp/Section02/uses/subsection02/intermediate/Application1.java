package com.swcamp.Section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/* 설명.
 *  filter()란?
 *   - 스트림의 요소 중에 조건을 만족하는 요소들만 걸러내는 중간 연산
 *   - 중간 연산들은 최종 연산 전에는 실행되지 않음
 * */
public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. filter() 중계 연산자를 활용할 수 있다. */
        IntStream.range(0, 10)
//                .peek(num -> System.out.print(num + " "))
                .filter(num -> num > 5)
//                .peek(num -> System.out.print("필터링 이후: " + num + " "))
                .forEach(System.out::println);

        /* 설명.
         *  Arrays.stream()은 배열(int[])만 인자로 받으며, 배열의 각 요소로 스트림을 만듦
         *  반면, IntStream.of()는 IntStream.of(1, 2, 3)처럼 숫자를 직접 나열 할 수도 있다.
         * */
        int[] scores = {45, 78, 92, 67, 88, 59, 95, 73, 84, 52};
        IntStream sStream = Arrays.stream(scores);                     // 배열일 경우는 이걸 더 선호
        sStream.filter(score -> score > 70)
                .forEach(score -> System.out.println(score + "점"));
        System.out.println();

//        IntStream.of(scores)
        IntStream.of(45, 78, 92, 67, 88, 59, 95, 73, 84, 52)    // 배열이 아닐 경우는 이걸 더 선호
                .filter(score -> score > 70)
                .forEach(score -> System.out.println(score + "점"));

        /* 설명. 문자열 스트림 관련 */
        List<String> pLanguage = Arrays.asList(
                "Java", "Python", "JavaScript", "C++", "Go", "Rust", "Kotlin"
        );

        System.out.println("\n\"J\"로 시작하는 단어만 출력");
        pLanguage.stream()
                .filter(lang -> lang.startsWith("J"))
                .forEach(System.out::println);

        System.out.println("\n4글자 이하인 단어만 출력");
        pLanguage.stream()
                .filter(lang -> lang.length() < 5)
                .forEach(System.out::println);

        System.out.println();

        /* 설명. 복합 조건 필터링 */
        IntStream.rangeClosed(1, 50)
                .filter(num -> num % 3 == 0)
                .filter(num -> num > 10)
                .forEach(num -> System.out.print(num + " "));
    }
}