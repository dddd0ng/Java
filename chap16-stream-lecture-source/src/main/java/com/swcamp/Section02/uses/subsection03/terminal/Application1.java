package com.swcamp.Section02.uses.subsection03.terminal;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/* 설명.
 *  최종 연산이란?
 *   - 스트림의 파이프라인 마지막에 위치하며 결과를 생성하는 연산
 *   - 지연평가: 최종 연산이 실행되기 전에는 중간 연산을 하지 않음
 *   - 최종 연산 후에는 스트림을 재사용할 수 없음
 *
 * 설명.
 *  - count(), sum(), max(), min(), average() ...
 * */
public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. calculation 관련 최종 연산자를 활용할 수 있다. */
        long count = IntStream.range(1, 10).count();
        System.out.println("count = " + count);
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("sum = " + sum);

        /* 설명. Optional 관련 타입을 반환하며 존재하지 않는 값에 대한 구체적인 처리를 할 수 있음 */
        /* 설명. 안전한 기본값 처리를 중요하게 생각하며 활용하는 것이 원칙 */
        OptionalInt max = IntStream.range(1, 10).max();
        System.out.println("max = " + max);
        OptionalInt maxNot = IntStream.range(1, 1).max();           // range 범위를 통해 숫자 생성 X
        System.out.println("maxNot = " + maxNot);                   // 존재하지 않으면 empty로 처리
        System.out.println("maxNot = " + maxNot.orElse(0));

        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("min = " + min.getAsInt());      // 숫자만 추출할 수도 있지만 가급적 get메소드는 안 쓰는게 좋음
        // 존재하지 않을 경우를 감안해서 만들어진 메소드 활용이 목적에 부합

        OptionalDouble avg = IntStream.range(1, 10).average();
        System.out.println("avg = " + avg.orElse(0.0)); // 존재하면 숫자로만 나오기도 함

        /* 설명. 홀수/짝수 분석 */
        /* 설명. 1. 홀수 분석 */
        long oddCount = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 != 0)
                .count();
        System.out.println("oddCount = " + oddCount);

        /* 설명. 2. 짝수 분석 */
        long evenCount = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("evenCount = " + evenCount);

        /* 설명. 짝수 합의 평균 */
        OptionalDouble optionalDouble = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .average();
        System.out.println("짝수 합의 평균은: " + optionalDouble.orElse(0.0));
    }
}