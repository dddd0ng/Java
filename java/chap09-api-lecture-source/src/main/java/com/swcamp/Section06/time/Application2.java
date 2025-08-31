package com.swcamp.Section06.time;

import java.time.*;

public class Application2 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        System.out.println("시간: " + localTime.getHour());
        System.out.println("분: " + localTime.getMinute());
        System.out.println("초: " + localTime.getSecond());
        System.out.println("나노초: " + localTime.getNano());

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("년: " + localDate.getYear());
        System.out.println("월: " + localDate.getMonth());
        System.out.println("월(숫자): " + localDate.getMonthValue());
        System.out.println("일(월 중에): " + localDate.getDayOfMonth());
        System.out.println("일(년 중에): " + localDate.getDayOfYear());
        System.out.println("일(주 중에): " + localDate.getDayOfWeek());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("zone 정보: " + zonedDateTime.getZone());
        System.out.println("시차: " +zonedDateTime.getOffset());
    }
}