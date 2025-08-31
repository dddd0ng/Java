package com.swcamp.Section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/* 설명.
 *  flatMap()이란?
 *  - 중첩된 구조를 평면화 하는 중간 연산
 *  - 스트림의 각 요소를 다른 스트림으로 변환 후 모든 스트림을 하나로 연결
 * */
public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. flatMap() 중개 연산자를 활용할 수 있다. */
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("javascript", "react", "vue"),
                Arrays.asList("python", "django", "fast api")
        );

        nestedList.stream().forEach(System.out::println);

//        nestedList.stream().flatMap(list -> list.stream())
        List<String> flatList = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        flatList.stream().forEach(System.out::println);

        /* 설명. 문장을 단어별로 들어있는 컬렉션으로 변환(중첩구조로 바꿨다가 다시 원래대로 복귀) */
        List<String> sentences = Arrays.asList("Hello World", "Java Stream", "FlatMap Method");

        /* 설명. 문자열 파싱으로 중첩구조를 만듦 */
//        sentences.stream()
//                .map(sentence -> sentence.split(" "))
//                .forEach(word -> System.out.print(Arrays.toString(word) + " "));

        /* 설명. 단어별 요소를 가지는 하나의 List 컬렉션으로 추출하는 파이프라인 */
        List<String> allWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println("allWords = " + allWords);

        /* 설명. 수업을 듣는 학생들의 전체 과목 리스트 평면화 */
        List<List<String>> studentSubjects = Arrays.asList(
                Arrays.asList("수학", "영어", "과학"),
                Arrays.asList("국어", "역사", "수학"),
                Arrays.asList("영어", "과학", "체육"),
                Arrays.asList("수학", "음악", "미술")
        );
        List<String> allSubjects = studentSubjects.stream()
                .flatMap(Collection::stream)
                .peek(sub -> System.out.print(sub + " "))
                .distinct()                     // 중복 제거
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nallSubjects = " + allSubjects);
    }
}