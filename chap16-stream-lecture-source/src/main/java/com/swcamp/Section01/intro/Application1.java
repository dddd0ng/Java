package com.swcamp.Section01.intro;

import java.util.Arrays;
import java.util.List;

/* 설명.
 *  Stream이란?
 *  - 컬렉션이나 배열을 함수형 프로그래밍으로 처리할 수 있게 해주는 API
 *  - 데이터를 필터링, 변환, 통계/집계 등의 작업을 간결하고 효율적으로 처리 가능
 *  - 원본 데이터를 변경하지 않고 새로운 결과를 생성(불변성)
 * */
public class Application1 {
    public static void main(String[] args) {

        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU 코어 수: " + coreCount + "개");

        /* 설명.
         *  Arrays.asList로 생성된 list는 실제로는 java.util.Arrays 안의 ArrayList이다.
         *  - 컬렉션의 ArrayList와 다른점
         *  1. 크기 변경 불가(추가 및 삭제 불가)
         *  2. 실제 ArrayList의 소속이 다름
         * */
        List<String> studyTopics = Arrays.asList(
                "Java 기초", "객체지향", "컬렉션", "Stream API", "Spring Boot");

        /* 설명. 1. for-each문 */
        for (String topic: studyTopics) {
            processTopic(topic);
        }
        System.out.println();

        /* 설명. 2. Stream 방식: 순차 스트림 */
        studyTopics.stream()
//                .forEach(topic -> processTopic(topic));
                .forEach(Application1::processTopic);
        System.out.println();

        /* 설명. 3. Stream 방식: 병렬 스트림(다만, 너무 적은 데이터(100만개 미만의 데이터)는 더 비효율 적임(feat.오버헤드 발생) */
        studyTopics.parallelStream()
                .forEach(Application1::processTopic);

    }

    /* 설명. 현재 실행 중인 쓰레드의 정보와 함께 출력 */
    private static void processTopic(String topic) {
        System.out.println(topic + "은 쓰레드 " + Thread.currentThread().getName() + "로 처리중...");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
