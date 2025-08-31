package com.swcamp.Section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/* 설명.
 *  map()이란?
 *   -  스트림의 각 요소들을 다른 요소로 변환하는 중간 연산
 *   - mapToInt(): 결과를 IntStream으로 변환
 *   - mapToDouble(): 결과를 DoubleStream으로 변환
 *   - mapToObj(): 기본형 스트림(IntStream 등)을 객체 스트림으로 변환
 *                 (ex: int -> Integer 등 Wrapper 클래스로 변환할 때 주로 사용)
 * */
public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. map() 중개 연산자를 활용할 수 있다. */
        /* 설명. 1. 개별 숫자 연산 */
        System.out.println("===== 홀수들만 5를 곱해서 출력 =====");
        IntStream.range(1, 10)
                .filter(i -> i % 2 != 0)
                .map(i -> i * 5)
                .forEach(result -> System.out.print(result + " "));

        /* 설명. 2. 문자열 변환 */
        System.out.println("===== 각 언어 대문자로 변환 =====");
        List<String> lang = Arrays.asList("java", "python", "javascript", "kotlin");
        System.out.println("원본: " + lang);
        lang.stream()
                .map(String::toUpperCase)
                .forEach(str -> System.out.print(str + " "));
        System.out.println();

        /* 설명. 3. 학생들 이름에서 성씨 추출하기 */
        System.out.println("===== 학생들의 이름에서 첫 글자 추출 =====");
        List<String> names = Arrays.asList("김철수", "김영희", "이순신", "유관순", "강감찬");
        names.stream()
                .map(name -> name.substring(0, 1))
                .forEach(str -> System.out.print(str + " "));
        System.out.println();

        /* 설명. 4. mapToInt() */
        List<String> lang2 = Arrays.asList("java", "go", "javascript", "kotlin");
        lang2.stream()
                .mapToInt(l -> l.length())
                .forEach(num -> System.out.print(num + " "));
        System.out.println();

        /* 설명. 5. filter + map 조합 */
        lang2.stream()
                .filter(l -> l.length() >= 4)
                .map(String::toUpperCase)
                .forEach(result -> System.out.print(result + " "));
    }
}