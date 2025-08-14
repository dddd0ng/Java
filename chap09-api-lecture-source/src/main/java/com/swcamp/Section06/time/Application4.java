package com.swcamp.Section06.time;

import java.time.*;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스가 제공하는 날짜 비교 연산 메소드를 활용할 수 있다. */
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2022, 11, 11);
        LocalDateTime future = LocalDateTime.of(2025, 11, 5, 15, 10, 10);
        ZonedDateTime now = zonedDateTime;

        /* 설명. 날짜나 시간을 비교할 때는 Time 패키지의 같은 타입의 객체끼리 비교해야 한다. */
        System.out.println(localDate.isAfter(past));
        System.out.println(localDateTime.isBefore(future));
        System.out.println(zonedDateTime.isEqual(now));
    }
}