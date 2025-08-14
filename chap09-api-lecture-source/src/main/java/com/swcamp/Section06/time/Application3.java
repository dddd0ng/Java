package com.swcamp.Section06.time;

import java.time.LocalDateTime;

public class Application3 {
    public static void main(String[] args) {

        /* 설명. time 패키지에서 제공되는 타입의 객체는 불변객체이다. */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("현재 시간: " + localDateTime);
        System.out.println("주소값: " + System.identityHashCode(localDateTime));

        /* 설명. 30분 후 */
        LocalDateTime localDateTime2 = localDateTime.plusMinutes(30);
        System.out.println("30분 후: " + localDateTime2);
        System.out.println("주소값: " + System.identityHashCode(localDateTime2));

        /* 설명. 3시간 전 */
        LocalDateTime localDateTime3 = localDateTime.minusHours(3);
        System.out.println("3시간 전: " + localDateTime3);
        System.out.println("주소값: " + System.identityHashCode(localDateTime3));
    }
}
