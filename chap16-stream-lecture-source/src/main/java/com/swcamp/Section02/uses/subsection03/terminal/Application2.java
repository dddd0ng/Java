package com.swcamp.Section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 설명.
 *  reduce()란?
 *   - 스트림의 요소들을 하나의 값으로 줄이는(reduce) 최종연산
 *   - 누적 연산을 통해 스트림의 모든 요소를 단일 결과로 결합
 *   - BinaryOperator 형태의 람다식 활용
 *
 * 설명.
 *  reduce()의 3가지 형태
 *  1. 1 param: Optional 반환(빈 스트림 고려)
 *  2. 2 param: 초기값 사용, 직접 값 변환
 *  3. 3 param: 병렬 처리 가능
 * */
public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. reduce() 최종 연산자를 활용할 수 있다. */
        /* 설명. 1. 기본 reduce: 1개의 매개변수에 람다식 작성 */
        OptionalInt reduceOneParam = IntStream.range(1, 6)      // 1, 2, 3, 4, 5
                .reduce((a, b) -> {
                    System.out.printf("%d, %d\n", a, b);
                    return a + b;
                });
        System.out.println("최종 결과: " + reduceOneParam.orElse(0));

        /* 설명. 2. 초기값을 가진 reduce: 1개의 초기값, 1개의 람다식 */
        int reduceTwoParam = IntStream.range(1, 6)
                .reduce(100, (a, b) -> {
                    System.out.printf("%d, %d\n", a, b);
                    return a + b;
                });
        System.out.println("최종 결과: " + reduceTwoParam);

        /* 설명. 3. 병렬 처리용 reduce: 1개의 초기값, 1개의 누적용 람다식, 1개의 결합용 람다식 */
        /* 설명. 세 번째로 전달된 람다식은 병렬 스트림 일때만 활용하는 cpu의 여러 코어로 계산한 결과를 결합 할 용도의 람다식이다. */
        Integer reduceTreeParam = Stream.of(4, 5, 1, 2, 3, 9, 6, 7, 8, 10)
//                .parallel()                       // 주석을 통해 순차 스트림과 병렬 스트림을 모두 테스트 해 볼 수 있음
                .reduce(0,                   // 초기값은 parallel일 경우는 요소 갯수만큼 적용
                        (a, b) -> {
                            System.out.printf("누적: %d, %d\n", a, b);
                            return a + b;
                        },
                        (x, y) -> {
                            System.out.printf("결합: %d, %d\n", x, y);
                            return x + y;
                        });
        System.out.println("최종 결과: " + reduceTreeParam);

        /* 설명. 문자열 연결 */
        List<String> words = Arrays.asList("Java", "Stream", "API", "reduce", "method");
        System.out.println("words = " + words);

        /* 설명. 단순 연결 */
        String simpleJoin = words.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("simpleJoin = " + simpleJoin);

        /* 설명. 구분자를 사용한 연결 */
        String joinWithSeparator = words.stream()
                .reduce("", (a, b) -> a.isEmpty() ? b : a + " | " + b);
        System.out.println("joinWithSeparator = " + joinWithSeparator);
    }
}